import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class convertListtoMap {
    public static void main(String[] args) {
        List<String> input= Arrays.asList("Java", "Python", "Javascript");
      Map<String,Integer> result=  input.stream().collect(Collectors.toMap(Function.identity(),String::length));
        System.out.println(result);
    }
}
