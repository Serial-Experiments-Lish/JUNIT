package org.junit.jupiter;

public class MethodReturnTypes {
    public static void main(String[] args) throws Exception {
        stringMethod();
        teger();
        shmoolean();
    }

    public static void stringMethod() {
        System.out.println("If this shows up, that means it's working.");
    }

    public static void teger() {
        int num1 = 202256;
        System.out.println(num1);
    }

    public static void shmoolean () {
        boolean t = true;
        System.out.println(t);
    }
}