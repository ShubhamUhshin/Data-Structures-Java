package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindElements {

    public List<Integer> findSecondAndThirdElement(List<Integer> list) {
        return list.stream()
                .skip(1)
                .limit(2)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        FindElements findElements = new FindElements();
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println (findElements.findSecondAndThirdElement(list));

    }
}
