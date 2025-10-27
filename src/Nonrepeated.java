import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Nonrepeated {
    public static void main(String[] args) {
        String input="swiss";
     Optional<Character> result=   input.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting())).entrySet().stream().filter(entry->entry.getValue()==1).map(Map.Entry::getKey).findFirst();
   result.ifPresent(c-> System.out.println("Non repeated chars"+c));
    }
}
