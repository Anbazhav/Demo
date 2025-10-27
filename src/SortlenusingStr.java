import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortlenusingStr {
    public static void main(String[] args) {
        List<String> words= Arrays.asList("java", "python", "C", "Javascript","Go");
      List<String> result=  words.stream().sorted(Comparator.comparingInt(String::length)).collect(Collectors.toList());
        System.out.println(result);
    }
}
