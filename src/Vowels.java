public class Vowels {
    public static void main(String[] args) {
        String input="Hello World";
       long result= input.chars().mapToObj(c->(char)c).filter(c->"aeiou".indexOf(c)>=0).count();
        System.out.println(result);
    }
}
