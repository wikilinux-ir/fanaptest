package q3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


interface UnaryFunction<R, T> {
    R function(T x);
}

interface UnaryPredicate<T> {
    boolean test(T x);
}

public class Functional {

    public static <T> List<T> filter(Iterable<T> seq, UnaryPredicate<T> pred) {
        List<T> result = new ArrayList<T>();
        for (T t : seq)
            if (pred.test(t))
                result.add(t);
        return result;
    }

    public static <R, T> List<R> transform(Iterable<T> seq, UnaryFunction<R, T> func) {
        List<R> result = new ArrayList<R>();
        for (T t : seq)
            result.add(func.function(t));
        return result;
    }

    

    public static void main(String[] args) {
        System.out.println(filter(Arrays.asList(1, 2, 3, 45, 6), new GreaterThan<Integer>(3)));

        System.out.println(transform(Arrays.asList(1,2,3,4,5,6), new InceremtEachIntegerElement()));
    }
}
