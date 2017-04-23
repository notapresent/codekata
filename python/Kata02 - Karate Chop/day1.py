from tests import test_chop


def chop(val, seq):
    try:
        return seq.index(val)
    except ValueError:
        return -1

if __name__ == '__main__':
	test_chop(chop)
