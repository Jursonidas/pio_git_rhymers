package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;
import edu.kis.vh.nursery.FIFORhymer;
import edu.kis.vh.nursery.HanoiRhymer;

/**
 * Klasa fabryczna odpowiedzialna za tworzenie różnych typów rymowaczy.
 * Implementuje interfejs Rhymersfactory.
 */
public class DefaultRhymersFactory implements Rhymersfactory {

    /**
     * Tworzy i zwraca standardowego rymowacza.
     *
     * @return instancja klasy DefaultCountingOutRhymer reprezentująca standardowego rymowacza
     */
    @Override
    public DefaultCountingOutRhymer GetStandardRhymer() {
        return new DefaultCountingOutRhymer();
    }

    /**
     * Tworzy i zwraca "fałszywego" rymowacza, identycznego jak standardowy.
     * Może być używany do testów lub demonstracji polimorfizmu.
     *
     * @return instancja klasy DefaultCountingOutRhymer
     */
    @Override
    public DefaultCountingOutRhymer GetFalseRhymer() {
        return new DefaultCountingOutRhymer();
    }

    /**
     * Tworzy i zwraca rymowacza FIFO (First In, First Out).
     *
     * @return instancja klasy FIFORhymer
     */
    @Override
    public DefaultCountingOutRhymer GetFIFORhymer() {
        return new FIFORhymer();
    }

    /**
     * Tworzy i zwraca rymowacza Hanoi, który odrzuca liczby
     * zgodnie ze strategią inspirowaną Wieżą Hanoi.
     *
     * @return instancja klasy HanoiRhymer
     */
    @Override
    public DefaultCountingOutRhymer GetHanoiRhymer() {
        return new HanoiRhymer();
    }

}
