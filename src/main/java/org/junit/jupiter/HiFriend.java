package org.junit.jupiter;

public class HiFriend {
    static String s1 = "Hi ";
    static String s2 = "Peter ";
    static String s3 = "Dinkleberg!";
    //String s4 = s1.concat(s2 + s3);
    public static void main(String[] args) throws Exception {
        friendHi();
    }

    public static String friendHi() {
        return s1 + s2 + s3;
    }
}