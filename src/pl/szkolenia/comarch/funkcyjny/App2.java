package pl.szkolenia.comarch.funkcyjny;

import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class App2 {
    public static void main(String[] args) {
        int w1 = calculate(App2::pobierzDaneZBazy, App2::policz2);
        /*w1 = policz2(pobierzDaneZBazy());

        int x = pobierzDaneZPliku();
        if(x > 3) {
            w1 = policz2(x);
        } else {
            w1 = 10;
        }*/

        int w2 = calculate(App2::pobierzDaneZPliku, App2::policz1);

        int w3 = calculate(App2::pobierzDaneZBazy, App2::policz3);

        System.out.println(w1);
        System.out.println(w2);
        System.out.println(w3);
    }

    public static int pobierzDaneZBazy() {
        System.out.println("Pobieram z bazy");
        return 5;
    }

    public static int pobierzDaneZPliku() {
        System.out.println("Pobieram dane z pliku");
        return 5;
    }

    public static int policz1(int x) {
        return x * 10;
    }

    public static int policz2(int x) {
        return x * 20;
    }

    public static int policz3(int x) {
        return x * 100;
    }

    public static int pobierzZBazyIPolicz1() {
        int x = pobierzDaneZBazy();
        return policz1(x);
    }

    public static int calculate(Supplier<Integer> pobieraczDanych,
                                UnaryOperator<Integer> algorytm) {
        int x = pobieraczDanych.get();
        if(x > 4) {
            return 10;
        }
        return algorytm.apply(x);
    }
}
