import java.util.Arrays;

public class Anangrams {

    public static void main(String[] args) {
        System.out.println(isAnagram("listen","silent"));
    }

        public static boolean isAnagram(String s, String t)
        {
            if (s.length() != t.length())
                return false;
            char[] a = s.toCharArray();
            char[] b = t.toCharArray();
            Arrays.sort(a);
            Arrays.sort(b);
            if (Arrays.equals(a, b))
                return true;

            return false;
        }

    }

