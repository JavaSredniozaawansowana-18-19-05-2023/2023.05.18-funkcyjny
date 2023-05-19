package pl.szkolenia.comarch.sortowanie;

import java.util.Comparator;

public class PorownywaczPoMarkachMalejaco implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return -o1.getBrand().compareTo(o2.getBrand());
    }
}
