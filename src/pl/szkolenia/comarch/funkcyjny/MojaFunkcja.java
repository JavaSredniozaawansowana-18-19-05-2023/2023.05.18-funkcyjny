package pl.szkolenia.comarch.funkcyjny;

import java.util.function.UnaryOperator;

public class MojaFunkcja implements UnaryOperator<Integer> {
    @Override
    public Integer apply(Integer integer) {
        return integer * 5;
    }
}
