import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution6 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList
                (4, 4, 2, 5, 5, 7, 6, 9));

      double average = list.stream()
              .sorted()
              .mapToDouble(x->x)
              .average()
              .getAsDouble();
        System.out.println(average);
    }
}
