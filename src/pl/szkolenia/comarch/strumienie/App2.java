package pl.szkolenia.comarch.strumienie;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class App2 {
    public static void main(String[] args) {
        Supplier<String> defaultStringSupplier = () -> "default2";
        Optional<String> stringBox = findString("xtttt");
        /*String s1 = stringBox.get();
        System.out.println(s1);*/
        /*if(stringBox.isPresent()) {
            String s = stringBox.get();
            System.out.println(s.toUpperCase());
        }*/
        //stringBox.ifPresent(s -> System.out.println(s.toUpperCase()));
        stringBox.ifPresentOrElse(s -> System.out.println(s.toUpperCase()),
                () -> System.out.println("puste pudelko !!!"));

        if(stringBox.isPresent()) {
            String s = stringBox.get();
            System.out.println(s.toUpperCase());
        } else {
            System.out.println("puste pudelko !!!");
        }

        /*String s1 = stringBox.orElseGet(defaultStringSupplier);
        System.out.println(s1);*/


    }

    public static Optional<String> findString(String pattern) {
        List<String> list = Arrays.asList("abc", "xyz", "asdf", "dsfggg");
        for(String element : list) {
            if(element.contains(pattern)) {
                return Optional.of(element);
            }
        }
        return Optional.empty();
    }
}
