package Stream;

import java.util.Collections;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class SecondLargetElement {

    public int secondLargestElementFinder (List<Integer> list) {
        return list.stream()
                .distinct()
                .sorted(Collections.reverseOrder())
                .skip(1)
                .limit(1)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("List must contain at least two elements"));
    }

    public static void main(String[] args) {

        SecondLargetElement secondLargetElement = new SecondLargetElement();

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        System.out.println (secondLargetElement.secondLargestElementFinder (list));
    }
}
