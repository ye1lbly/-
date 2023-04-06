package practice;

import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Practice14 {
    public static void main(String[] args) {
        String[] strings = { "aaa", "bb", "c", "dddd" };

        /* 14-5 */
        IntStream intStream = Stream.of(strings).mapToInt(String::length);
        int sum = intStream.reduce(0, Integer::sum); //(a, b) -> a + b
        System.out.println("sum = " + sum);

        /* 14-6 */
        IntStream intStream1 = Stream.of(strings).mapToInt(String::length);
        OptionalInt maxLength = intStream1.reduce(Integer::max);
        System.out.println("maxLength = " + maxLength.getAsInt());
    }
}
