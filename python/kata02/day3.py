from tests import test_chop


def chop(val, seq, offset=0):
    if not seq: return -1
    if len(seq) == 1: return offset if seq[0] == val else -1
    c = len(seq) / 2
    if seq[c] <= val:
        return chop(val, seq[c:], offset + c)
    else:
        return chop(val, seq[:c], offset)


if __name__ == '__main__':
    test_chop(chop)

