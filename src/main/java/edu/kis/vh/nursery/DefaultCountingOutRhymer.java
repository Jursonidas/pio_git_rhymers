package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private int[] NUMBERS = new int[12];

    public int _total = -1;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++_total] = in;
    }

    public boolean callCheck() {
        return _total == -1;
    }

    public boolean isFull() {
        return _total == 11;
    }

    protected int peekaboo() {
        if (callCheck())
            return -1;
        return NUMBERS[_total];
    }

    public int countOut() {
        if (callCheck())
            return -1;
        return NUMBERS[_total--];
    }

}
