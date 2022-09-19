import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Solution5 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            list.add(i, new Random().nextInt(20));
        }

        System.out.println(list.stream().count());
    }
}
