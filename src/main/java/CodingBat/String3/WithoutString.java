package CodingBat.String3;

import java.util.Objects;


/**
 * Given two strings, base and remove, return a version of the base string where all instances of the remove
 * string have been removed (not case sensitive). You may assume that the remove string is length 1 or more.
 * Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".

 withoutString("Hello there", "llo") → "He there"
 withoutString("Hello there", "e") → "Hllo thr"
 withoutString("Hello there", "x") → "Hello there"
 withoutString("Hello there", "LLo") → "He there"

 */

public class WithoutString {
    public static void main(String[] args) {
        WithoutString test = new WithoutString();
        System.out.println(test.withoutString("AA22bb", "2"));
    }
    public String withoutString(String base, String remove) {
        String check = "";
        for (int i = 0; i<base.length();i++) {
            for (int j = 0; j<remove.length() && i+j<base.length();j++) {
                String a = base.substring(i + j, i + j + 1);
                check = check.concat(a);
            }
            if (Objects.equals(check.toLowerCase(), remove.toLowerCase())) {
                base = base.substring(0,i)+base.substring(i+remove.length(),base.length());
                i--;
            }
            check = "";
        }
        return base;
    }

}
