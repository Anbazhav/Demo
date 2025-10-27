import java.util.stream.IntStream;

public class Palindrome {
    public static void main(String[] args) {
        String input="madam";
        boolean result=IntStream.range(0, input.length()/2).allMatch(i->input.charAt(i)==input.charAt(input.length()-i-1));
        System.out.println(result);
    }
}
