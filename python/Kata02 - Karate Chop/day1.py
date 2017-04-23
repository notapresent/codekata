def chop(val, seq):
    try:
        return seq.index(val)
    except ValueError:
        return -1
