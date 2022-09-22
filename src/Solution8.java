import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution8 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Gleb", "Kirill", "alexander", "Andrey", "Yarik", "Artem",
                "Evgenii", "Andrey", "Dmitry", "Polina"));

        List<String> aNames = names.stream()
                .filter(name -> {
                    if (name.startsWith("a") || name.startsWith("A"))
                        return true;
                    else return false;
                })
                .collect(Collectors.toList());
        System.out.println(aNames);

    }
}
