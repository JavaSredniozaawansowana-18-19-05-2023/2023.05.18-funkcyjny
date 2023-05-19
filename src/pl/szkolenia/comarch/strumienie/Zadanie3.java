package pl.szkolenia.comarch.strumienie;

import java.util.ArrayList;
import java.util.List;

public class Zadanie3 {
    public static void main(String[] args) {
        List<Car> list = new ArrayList<>();
        list.add(new Car("BMW"));
        list.add(new Car("Audi"));
        list.add(new Car("Toyota"));
        System.out.println(list);

        list.stream().peek(car -> car.setBrand("Kia")).forEach(System.out::println);

        System.out.println(list);
    }
}
