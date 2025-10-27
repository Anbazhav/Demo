import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;



public class Uppercase {
    public static void main(String[] args) {
        List<String> input= Arrays.asList("java", "stream", "api");
       List<String> result=input.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(result);}
}
