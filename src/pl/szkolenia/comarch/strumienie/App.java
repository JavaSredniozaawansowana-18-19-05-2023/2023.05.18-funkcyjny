package pl.szkolenia.comarch.strumienie;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,1,9,3,2,6,4,5,5,4,6,7,8,9);
        System.out.println(list);

        Stream<Integer> stream = list.stream();
        //stream.forEach(System.out::println);
        //long count = stream.count();
        //System.out.println(count);
        /*Optional<Integer> maxBox = stream.min((a,b) -> a-b);
        System.out.println(maxBox.get());*/
        /*Optional<Integer> elementStrumienia = stream.findAny();
        System.out.println(elementStrumienia.get());*/
        boolean result = stream.noneMatch(x -> x > 5);
        System.out.println(result);

        System.out.println(list.stream().count());

        OptionalDouble avr = list.stream()
                .parallel()
                .mapToInt(x -> x)
                .average();
        System.out.println(avr);
    }
}
