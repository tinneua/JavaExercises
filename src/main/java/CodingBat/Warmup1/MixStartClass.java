package CodingBat.Warmup1;

/**
 * Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.

 mixStart("mix snacks") → true
 mixStart("pix snacks") → true
 mixStart("piz snacks") → false

 */

public class MixStartClass {
    public static void main(String[] args) {
        MixStartClass test = new MixStartClass();
        System.out.println(test.mixStart("mix snacks"));
    }


    public boolean mixStart(String str) {
        if (str.length()>2) {
            System.out.println("substring: "+str.substring(1,3));
            return (str.substring(1,3).equals("ix"));
        } else {
            return false;
        }

    }
}


