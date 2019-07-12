/**
 * Created by perl on 2019/7/12.
 *
 * 709. To Lower Case
 *
 * Implement function ToLowerCase() that has a string parameter str, and returns the same string in lowercase.
 *
 * Example 1:
 *
 * Input: "Hello"
 * Output: "hello"
 *
 * Example 2:
 *
 * Input: "here"
 * Output: "here"
 *
 * Example 3:
 *
 * Input: "LOVELY"
 * Output: "lovely"
 */
public class ToLowerCase {

    public static String toLowerCase(String str) {
        if (str == null || str == "" || str.length() == 0) {
            return str;
        }
        char[] chars = new char[str.length()];
        for (int i = 0;i < str.length();i++) {
            chars[i] = Char2LowerCase(str.charAt(i));
        }

        return String.valueOf(chars);
    }

    private static char Char2LowerCase(char c) {
        return c >= 'A' && c <= 'Z' ? (char) (c + 32) : c;
    }


    public static void main(String[] args) {
        System.out.println(ToLowerCase.toLowerCase("Hello"));
        System.out.println(ToLowerCase.toLowerCase("here"));
        System.out.println(ToLowerCase.toLowerCase("LOVELY"));
    }
}
