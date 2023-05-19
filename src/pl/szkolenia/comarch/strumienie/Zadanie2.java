package pl.szkolenia.comarch.strumienie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Zadanie2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,1,9,3,2,6,4,5,5,4,6,7,8,9);

        /*List<Integer> result = new ArrayList<>();
        for(int element : list) {
            if(element > 3 && element < 7 && !result.contains(element)) {
                result.add(element);
            }
        }
        System.out.println(result);*/

        List<Integer> result = list.stream()
                .distinct()
                .parallel()
                .filter(x -> x > 3 && x < 7)
                .toList();
        System.out.println(result);

        list.stream()
                .peek(System.out::println)
                .filter(x -> x > 3)
                .filter(x -> x < 7)
                .distinct()
                .map(x -> "Liczba: " + x)
                .skip(1)
                .limit(1)
                .forEach(System.out::println);
    }
}
