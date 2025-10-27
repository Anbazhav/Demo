import java.util.*;
public class Reverse {
    public static void main(String[] args) {
        String str="hello";
       String result=str.chars().mapToObj(c->String.valueOf((char)c)).reduce("",(a,b)->b+a);
        System.out.println(result);
    }
}

