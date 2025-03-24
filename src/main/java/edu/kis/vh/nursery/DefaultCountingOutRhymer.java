package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int DEFAULT_VALUE = -1;
    private static final int MAX_SIZE = 12;
    private static final int RETURN_VALUE = -1;
    private final int[] NUMBERS = new int[MAX_SIZE];

    private int _total = DEFAULT_VALUE;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++_total] = in;
    }

    public boolean callCheck() {
        return _total == DEFAULT_VALUE;
    }

    public boolean isFull() {
        return _total == MAX_SIZE - 1;
    }

    protected int peekaboo() {
        if (callCheck())
            return RETURN_VALUE;
        return NUMBERS[_total];
    }

    public int countOut() {
        if (callCheck())
            return RETURN_VALUE;
        return NUMBERS[_total--];
    }

}