import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution9 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Gleb", "Kirill", "Alexander", "Andrey", "Yarik", "Artem",
                "Evgenii", "Andrey", "Dmitry", "Polina"));

//        List<String> names = new ArrayList<>();

        String firstElement = names.stream()
                .sorted()
                .findFirst()
                .orElse("Empty");
        System.out.println(firstElement);
    }
}
