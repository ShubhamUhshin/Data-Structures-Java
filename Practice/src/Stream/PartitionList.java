// Partition a list into even and odd
package Stream;

import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionList {

    public Map<String, List<Integer>> partition(List<Integer> list) {
        Map<Boolean, List<Integer>> boolMap = list.stream()
                .collect(Collectors.partitioningBy(i -> i % 2 == 0));
        Map<String, List<Integer>> result = boolMap.entrySet().stream()
                .collect(Collectors.toMap(
                        e -> e.getKey() ? "even" : "odd",
                        e -> e.getValue()
                ));
        return result;
    }

    public static void main(String[] args) {
        PartitionList partitionList = new PartitionList();
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(partitionList.partition(list));
    }
}
