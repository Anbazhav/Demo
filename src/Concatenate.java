import javax.swing.text.html.Option;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Concatenate {
    public static void main(String[] args) {
        List<String> word= Arrays.asList("I", "Love", "u");
       String result= word.stream().collect(Collectors.joining(" "));
        System.out.println(result);

    }
}
