import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution7 {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>(Arrays.asList("Gleb", "Kirill", "Alexander", "Andrey", "Yarik", "Artem",
                "Evgenii", "Andrey", "Dmitry", "Polina"));

        System.out.println(names.stream()
                .filter(name -> name.equalsIgnoreCase("Alexander"))
                .count());

    }
}
