import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList
                (1, 1, 2, 2, 3, 3, 4, 4, 4, 5, 6, 10, 11, 12, 13, 14, 15, 16, 17, 19, 20));

        List<Integer> newList = list.stream()
                .map(x -> x * 2).collect(Collectors.toList());
        System.out.println(newList);
    }
}
