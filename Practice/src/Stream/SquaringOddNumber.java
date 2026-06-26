// Filter odd numbers & square them

package Stream;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class SquaringOddNumber {

    public List<Integer> squareOddNumber (List<Integer> number){

        return number.stream()
                .filter(n -> n%2 == 1)
                .map (n -> n*n)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {

        SquaringOddNumber squaringOddNumber = new SquaringOddNumber();

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(squaringOddNumber.squareOddNumber (numbers));


    }
}
