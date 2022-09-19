import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Solution4 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            list.add(i, new Random().nextInt(20));
        }
        System.out.println(list);
        List<Integer> newList = list.stream()
                .sorted()
                .limit(4)
                .collect(Collectors.toList());
        System.out.println(newList);
    }
}
