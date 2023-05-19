package pl.szkolenia.comarch.sortowanie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        /*list.add(4);
        System.out.println(list.get(0));
        System.out.println(list.size());
        list.remove(0);
        System.out.println(list);
        System.out.println(list.size());*/
        list.add(4);
        list.add(1);
        list.add(8);
        list.add(3);
        System.out.println(list);

        Collections.sort(list);

        System.out.println(list);

        Car car = new Car("BMW", "3", 300.00);
        System.out.println(car);
        //car.compareTo(new Car("asdf", "asdf", 234.234));

        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Audi", "A3", 200.00));
        cars.add(new Car("Toyota", "Corolla", 150.00));
        cars.add(new Car("Kia", "Ceed", 170.00));
        cars.add(new Car("BMW", "5", 400.00));

        System.out.println(cars);

        Collections.sort(cars, new PorownywaczPoCenieRosnaco());

        System.out.println(cars);

        Collections.sort(cars, new PorownywaczPoMarkachMalejaco());

        System.out.println(cars);

        Collections.sort(cars, (c1,c2) -> c1.getBrand().compareTo(c2.getBrand()));

        Comparator<Car> porownywacz = new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getBrand().compareTo(o2.getBrand());
            }
        };

        Collections.sort(cars, porownywacz);

        System.out.println(cars);

        MojInterfejs mojInterfejs = new MojInterfejs() {
            @Override
            public void metoda1() {
                System.out.println("mteoda 1");
            }

            @Override
            public int metoda2(int x) {
                return 1;
            }

            @Override
            public void metoda3(String s) {
                System.out.println(s);
            }
        };
    }
}
