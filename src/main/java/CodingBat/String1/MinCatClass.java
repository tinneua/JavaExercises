package CodingBat.String1;

/**
 * Given two strings, append them together (known as "concatenation") and return the result.
 * However, if the strings are different lengths, omit chars from the longer string
 * so it is the same length as the shorter string. So "Hello" and "Hi" yield "loHi". The strings may be any length.

 minCat("Hello", "Hi") → "loHi"
 minCat("Hello", "java") → "ellojava"
 minCat("java", "Hello") → "javaello"
 */
public class MinCatClass {
    public static void main(String[] args) {
        MinCatClass test = new MinCatClass();
        System.out.println("Result is: "+test.minCat("java","Hello"));
    }

    public String minCat(String a, String b) {
        if (a.length() == b.length()) {
           return a+b;
        } else if (a.length() > b.length()) {
            return a.substring(a.length() - b.length(),a.length()) + b;
        } else {
            return a + b.substring(b.length() - a.length(),b.length());
        }
    }
}
