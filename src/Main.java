import java.util.Comparator;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
       Integer[] massiv={1,2,3,4,5,6,7,8,9};
        Stream<Integer> integerStream = Stream.of(massiv).filter(x -> x % 2 == 0).map(x -> x * x);
        integerStream.max(Comparator.comparing(x->x)).stream().toList().forEach(System.out::println);

    }
}