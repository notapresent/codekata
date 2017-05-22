import bisect
from tests import test_chop


def chop(val, seq):
    pos = bisect.bisect_left(seq, val)
    return pos if len(seq) > pos and seq[pos] == val else -1


if __name__ == '__main__':
    test_chop(chop)
