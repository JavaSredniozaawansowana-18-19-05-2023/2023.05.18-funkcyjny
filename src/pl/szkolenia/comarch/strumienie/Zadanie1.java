package pl.szkolenia.comarch.strumienie;

import java.util.Arrays;
import java.util.List;

public class Zadanie1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,4,67,1,234,12,643,32,341);

        /*int sum = 0;
        for(int element : list) {
            sum += element;
        }
        double avr = ((double) sum) / ((double) list.size());*/
        double avr = list.stream().mapToInt(x -> x).average().getAsDouble();
        System.out.println(avr);


    }
}
