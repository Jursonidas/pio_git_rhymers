package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static int MINUS_ONE = -1;
    public static int ROZMIAR_TAB = 12;
    private int[] NUMBERS = new int[ROZMIAR_TAB];

    public int _total = MINUS_ONE;

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