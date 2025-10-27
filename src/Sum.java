import java.util.Arrays;

public class Sum {
    public static void main(String[] args) {
        String input="abc123def45gh6";
        long sum= Arrays.stream(input.split("\\D+")).filter(s->!s.isEmpty()).mapToInt(Integer::parseInt).sum();
        System.out.println(sum);
    }

}
