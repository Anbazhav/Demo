import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Freqchar {
    public static void main(String[] args) {
        String input="programming";
      Optional<Map.Entry<Character, Long>> result= input.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().max(Map.Entry.comparingByValue());
   result.ifPresent(entry-> System.out.println(entry.getKey()+ ": "+entry.getValue()));
    }
}
