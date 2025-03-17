package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int ROZMIAR_TAB = 12;
    public static final int MINUS_1 = -1;
    private int[] NUMBERS = new int[ROZMIAR_TAB];

    public int _total = MINUS_1;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++_total] = in;
    }

    public boolean callCheck() {
        return _total == MINUS_1;
    }

    public boolean isFull(){ return _total == ROZMIAR_TAB - 1; }

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