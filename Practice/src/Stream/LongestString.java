package Stream;

import java.util.List;
import java.util.Arrays;

public class LongestString {

    public String findLongestWord(List<String> list) {

        return list.stream()
                .distinct()
                .reduce((a, b) -> a.length() >= b.length() ? a : b)
                .orElse(null);
    }

    public static void main(String[] args) {
        LongestString longestString = new LongestString();

        List<String> list = Arrays.asList("hello", "world", "java", "stream");

        System.out.println(longestString.findLongestWord(list));
    }
}
