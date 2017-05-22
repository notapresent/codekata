import math
import os
import re
import requests


DATAFILE_URL = 'http://codekata.com/data/04/weather.dat'
FILENAME = 'weather.dat'


def download_to_file(filename, url):
    """Download and save file"""
    with open(filename, 'w') as f:
        f.write(requests.get(url).text)


def ensure_datafile(filename, url):
    """Check if given file exists and download it from url if it doesn't"""
    if not os.path.isfile(filename):
        download_to_file(filename, url)


def records_from_lines(lines):
    """Makes list of dicts from sequence of lines. Uses 1st line as field names, skips empty lines"""
    header = parse_header(next(lines))
    for line in lines:
        if not line.strip():
            continue
        yield make_record(header, line)


def parse_header(line):
    """Returns dict {'field': (start, length), ...}"""
    fields = [f.strip() for f in line.split(' ') if f.strip()]
    return {field: (line.index(field), len(field) + 1) for field in fields}


def make_record(header, line):
    """Parses line according to header and returns dict"""
    rec = {field: line[start:start+length] for field, (start, length) in header.items()}
    return {field: make_value(val) for field, val in rec.items()}


def make_value(val):
    """Tries to return numeric value or argument unchanged if it cannot be parsed as int or float"""
    val = val.strip()
    numval = re.sub('[^\d\.\-]', '', val)
    if numval:
        if '.' in numval:
            return float(numval)
        else:
            return int(numval)
    return val or None


def min_spread_record(records, max_field, min_field):
    """Return record with smallest difference between max_field and min_field or None if sequence is empty"""
    min_spread = math.inf
    rv = None
    for rec in records:
        if rec[max_field] is None or rec[min_field] is None:
            continue
        spread = rec[max_field] - rec[min_field]
        if spread < min_spread:
            rv = rec
            min_spread = spread
    return rv


def min_spread_day_num(records):
    """Returns day number with minimum spread between MxT and MnT"""
    rec = min_spread_record(records, 'MxT', 'MnT')
    return rec['Dy']


def main():
    ensure_datafile(FILENAME, DATAFILE_URL)
    with open(FILENAME) as lines:
        records = list(records_from_lines(lines))
        print(min_spread_day_num(records))

    # fields = list(records[0].keys())
    # with open('weather.csv', 'w') as f:
    #     f.write(', '.join(fields) + '\n')
    #     for rec in records:
    #         values = [str(rec[field]) for field in fields]
    #         f.write(', '.join(values) + '\n')


if __name__ == '__main__':
    main()