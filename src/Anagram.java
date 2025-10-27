import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Anagram {
    public static void main(String[] args) {
      List<String> s= Arrays.asList("silent","listen","enlist", "banana" );
      String target="silent";
  List<String> anagrams=    s.stream().filter(str->Arrays.equals(str.chars().sorted().toArray(),target.chars().sorted().toArray())).collect(Collectors.toList());
        System.out.println(anagrams);
    }
}
