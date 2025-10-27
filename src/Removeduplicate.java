import java.util.stream.Collectors;

public class Removeduplicate {
    public static void main(String[] args) {
        String input="progamming";
       String result= input.chars().distinct().mapToObj(c->String.valueOf((char)c)).collect(Collectors.joining());
        System.out.println(result);
    }
}
