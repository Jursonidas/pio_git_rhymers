package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static int DEFAULT_VALUE = -1;
    public static int MAX_SIZE = 12;
    public static int RETURN_VALUE = -1;
    private final int[] NUMBERS = new int[MAX_SIZE];

    public int _total = DEFAULT_VALUE;

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