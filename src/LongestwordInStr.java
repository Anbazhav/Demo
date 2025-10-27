import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class LongestwordInStr {
    public static void main(String[] args) {
        String input="Java 8 stream are very powerful";
       Optional<String> result= Arrays.asList(input.split("\\s+")).stream().max(Comparator.comparingInt(String::length));
   result.ifPresent(s-> System.out.println(result));
    }
}
