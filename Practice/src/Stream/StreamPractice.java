package Stream;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;


public class StreamPractice{

    public static void main (String args[]) throws IOException{

        List <String> words = Arrays.asList("Hello", "World", "Create", "Existing", "Service");
        /* Convert all strings in a list to uppercase.
        List <String> words = Arrays.asList("hello", "there");

        List <String> result = words.stream()
                .map (word -> word.toUpperCase())
                .collect (Collectors.toList());

        System.out.println(result);


        // Calculate the sum of all numbers in a list.
        List <Integer> nums = Arrays.asList(1,2,3,4,5);

        long result = nums.stream()
                .reduce(0, Integer::sum);

        long result = nums.stream()
                        .mapToInt(Integer::intValue)
                                .sum();

        System.out.println(result);



        // Check if any string in a list contains “API”.

        List <String> words = Arrays.asList("Hello World","Create", "Existing", "Service");

        System.out.println(words.stream().anyMatch(n -> n.contains("API")));


        // Identify duplicate elements in a list.
        List <Integer> nums = Arrays.asList(1,2,23,45);

        Set<Integer> duplicates = new HashSet<>();
        Set<Integer> unique = new HashSet<>();

        duplicates = nums.stream()
                .filter(n -> !unique.add (n))
                .collect(Collectors.toSet());

        System.out.println (duplicates);


        // Group a list of strings based on their length.
        List <String> words = Arrays.asList("I","am","doing","some","strange","work","to","clear","stuff");

        Map<Integer,List<String>> map = words.stream()
                .collect(Collectors.groupingBy(n -> n.length()));
        System.out.println(map);



        // Given a list of lists, flatten it into a single list.
        List<List<Integer>> nums = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7, 8, 9)
        );

        List <Integer> result = nums.stream()
                .flatMap(List::stream).collect(Collectors.toList());

        System.out.println (result);



        // Concatenate all strings in a list into a single string.
        List <String> words = Arrays.asList("String1","String2");
        String result = words.stream()
                        .reduce("",(s1,s2) ->s1+" "+s2);

        System.out.println (result);



        // Find the longest string in a list.
        int longestString = words.stream()
                .map (String::length).reduce (Integer::max).stream().mapToInt(Integer::intValue).sum();

        String longestString = words.stream()
                        .reduce((word1,word2) -> word1.length() > word2.length() ? word1 : word2)
                .orElse(null);

        System.out.println (longestString);
         */

        // Count the frequency of each character in a string.
        String word = "words in a string";
        Map <Character, Long> frequencyOfWords = word.chars()
                .mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(c->c,Collectors.counting()));

        System.out.println (frequencyOfWords);



    }
}