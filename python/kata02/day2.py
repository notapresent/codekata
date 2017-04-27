from kata02 import test_chop


def chop(val, seq):

    if not seq:
        return -1

    if len(seq) == 1:
        return 0 if seq[0] == val else -1

    s, e = 0, len(seq) - 1

    while e - s > 1:
        c = (e - s) / 2
        if seq[c] > val:    # left half
            s, e = s, c
        elif seq[c] < val:  # right half
            s, e = c+1, e
        else:
            return c

        if seq[s] == val:
            return s
        elif seq[e] == val:
            return e

    return -1


if __name__ == '__main__':
    test_chop(chop)
