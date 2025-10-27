import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupStr {
    public static void main(String[] args) {
        List<String> words= Arrays.asList("a", "bb", "cc", "ddd", "eee");
      Map<Integer, List<String> > result=  words.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(result);
    }
}
