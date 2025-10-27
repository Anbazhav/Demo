import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Findstartcharfromstr {
    public static void main(String[] args) {
        List<String> input= Arrays.asList("apple", "banana", "avacoda", "berry","apricot");
        char start='a';
       List<String> result= input.stream().filter(i->i.charAt(0)==start).collect(Collectors.toList());
        System.out.println(result);
    }
}
