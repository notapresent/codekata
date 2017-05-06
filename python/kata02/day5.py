from tests import test_chop


class BinaryChopper:
    def __init__(self, seq, start=0, length=None):
        self.seq = seq
        self.start = start
        self.length = length or len(seq)

    def index(self, val):
        """Returns index of val in self.seq or -1 if val is not in self.seq"""
        if not self.seq:    # empty sequence
            return -1

        if self.length == 1:
            return self.start if self.seq[self.start] == val else -1

        assert self.length >= 2

        c = self.length / 2
        if self.seq[self.start + c] <= val:  # right
            return BinaryChopper(self.seq, self.start + c, self.length - c).index(val)
        else:   # left
            return BinaryChopper(self.seq, self.start, c).index(val)


def chop(val, seq):
    bcl = BinaryChopper(seq)
    return bcl.index(val)

if __name__ == '__main__':
    test_chop(chop)
