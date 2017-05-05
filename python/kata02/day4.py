from collections import OrderedDict
from tests import test_chop


def chop(val, seq):
    """This implementation passes slices of sequence packed in OrderedDict, thus eliminating the need to pass offset as parameter"""
    if isinstance(seq, list):
        seq = OrderedDict(enumerate(seq))
    
    if not seq: return -1

    if len(seq) == 1: 
        k, v = seq.items()[0]   
        return k if v == val else -1
    
    start = seq.keys()[0]
    c = len(seq) / 2
    if seq[start + c] <= val:
        return chop(val, OrderedDict(seq.items()[c:]))
    else:
        return chop(val, OrderedDict(seq.items()[:c]))


if __name__ == '__main__':
    test_chop(chop)
