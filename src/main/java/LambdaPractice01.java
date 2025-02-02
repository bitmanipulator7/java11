import javax.print.DocFlavor;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaPractice01 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jane", "Jeremy");
        names.forEach((var name) -> System.out.println(name));

        String multilineText = "This is\nJava 11\nfeature";
        List<String> lines = multilineText.lines()
                .filter(line -> !line.isBlank())
                .collect(Collectors.toList());
        System.out.println("Filtered lines: " + lines);

        List<String> words = Arrays.asList("Java", "Spring", "Boot", "Lambda", "Functional Interface");
        List<String> longWords = words.stream().filter(n -> n.length() > 4)
                .collect(Collectors.toList());
        System.out.println("Words longer than 4 characters: " + longWords);

        List<String> unmodifiableNames = List.copyOf(names);
        System.out.println("Unmodifiable names: " + unmodifiableNames);
    }
}
