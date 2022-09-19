import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution8 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Gleb", "Kirill", "Alexander", "Andrey", "Yarik", "Artem",
                "Evgenii", "Andrey", "Dmitry", "Polina"));

        List<String> aNames = names.stream()
                .filter(name->name.matches("[Aa]\\w+"))
                /*.filter(name->{
                    if (name.charAt(0) == 'a' || name.charAt(0) == 'A') {
                        return true;
                    } else
                        return false;
                })*/
                .collect(Collectors.toList());
        System.out.println(aNames);

    }
}
