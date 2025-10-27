import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class LongestStrInList {
    public static void main(String[] args) {
        List<String> input= Arrays.asList("Java", "Python", "JavaScript", "C++");
      Optional<String> result= input.stream().max(Comparator.comparingInt(String::length));
      result.ifPresent(c-> System.out.println("LongestString: "+c));

    }
}
