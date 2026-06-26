// Remove duplicates & sort in descending order

package Stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;

public class DistinctSort {

    public List<Integer> sorter(List<Integer> list) {
        return list.stream()
                .distinct()
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());
    }

    public static void main (String args[]){
        DistinctSort distinctSort = new DistinctSort();
        List<Integer> numbers = Arrays.asList(5, 3, 3, 8, 8, 1, 2, 5, 3, 7);
        List<Integer> distinctSorted = distinctSort.sorter(numbers);
        System.out.println(distinctSorted);

    }

    public static class FindElements {

        public static void main(String[] args) {


            FindElements findElements = new FindElements();
            List<Integer> list = new ArrayList<>();

        }
    }
}
