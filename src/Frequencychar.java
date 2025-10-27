import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Frequencychar {
    public static void main(String[] args) {
        String str="programming";
      Map<Character, Long> result=  str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(result);
    }
}
