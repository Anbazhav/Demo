import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Splistrcoutcoourence {
    public static void main(String[] args) {
        String input="hello word";
        Map<String, Long> result=Arrays.asList(input.split("")).stream().filter(c->!c.isEmpty()).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(result);
    }
}