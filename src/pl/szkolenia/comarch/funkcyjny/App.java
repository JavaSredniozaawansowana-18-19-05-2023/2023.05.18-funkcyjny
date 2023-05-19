package pl.szkolenia.comarch.funkcyjny;

import pl.szkolenia.comarch.sortowanie.Car;

import java.util.function.*;

public class App {
    public static void main(String[] args) {
        Function<Integer, String> function = i -> "Liczba" + i;

        String s1 = function.apply(10);
        String s2 = function.apply(20);
        String s3 = function.apply(40);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        /*BiFunction<Integer, String, Boolean> biFunction = new BiFunction<Integer, String, Boolean>() {
            @Override
            public Boolean apply(Integer integer, String s) {
                return (integer + s).length() > 10;
            }
        };*/

        BiFunction<Integer, String, Boolean> biFunction = (i,s) -> (i + s).length() > 10;

        System.out.println(biFunction.apply(10, "czesc"));
        System.out.println(biFunction.apply(345, "do widzenia"));
        System.out.println(biFunction.apply(56745, "siema"));

        /*UnaryOperator<Integer> unaryOperator = new UnaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer * 10;
            }
        };*/

        UnaryOperator<Integer> unaryOperator = i -> i*10;

        System.out.println(unaryOperator.apply(10));
        System.out.println(unaryOperator.apply(5));
        System.out.println(unaryOperator.apply(123));

        /*Predicate<String> predicate = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length() <= 5;
            }
        };*/

        Predicate<String> predicate = s -> s.length() <= 5;

        System.out.println(predicate.test("asd"));
        System.out.println(predicate.test("kjashdgjk"));
        System.out.println(predicate.test("no siema"));

        /*Supplier<Car> supplier = new Supplier<Car>() {
            @Override
            public Car get() {
                return new Car("default", "default", 100.00);
            }
        };*/

        Supplier<Car> supplier = () -> new Car("default", "default", 100.00);

        System.out.println(supplier.get());
        System.out.println(supplier.get());
        System.out.println(supplier.get());

        /*Consumer<Car> consumer = new Consumer<Car>() {
            @Override
            public void accept(Car car) {
                System.out.println(car.getBrand());
            }
        };*/

        Consumer<Car> consumer = System.out::println;

        consumer.accept(new Car("BMW", "3", 200.00));
        consumer.accept(supplier.get());
        consumer.accept(new Car("Kia", "Stinger", 400.00));

        Predicate<String> predicate2 = s -> {
            if(s.length() < 5) {
                return true;
            } else if(s.contains("a")) {
                return true;
            } else {
                return false;
            }
        };

        final int x = 5;
        UnaryOperator<Integer> jakasFunkcja = i -> i * x;

        jakasFunkcja.apply(5);
        //x = 10;
        jakasFunkcja.apply(5);

        //x=10;

        UnaryOperator<Integer> jakasFunkcja2 = new UnaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer * x;
            }
        };

        BiFunction<Integer, Integer, Integer> suma = App::sum;

        TurboFunkcja turboFunkcja = (a,b,c) -> System.out.println(a + b + c);
        turboFunkcja.apply(4,7,10);
    }

    public static int sum(int a, int b) {
        return a+b;
    }
}
