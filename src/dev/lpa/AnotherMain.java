package dev.lpa;

//🔯🔯 [3 DOTS METHOD] 🔯🔯 🔯🔯 [3 DOTS METHOD] 🔯🔯 🔯🔯 [3 DOTS METHOD] 🔯🔯
public class AnotherMain {

    public static void main(String... args) {
        System.out.println("Hello world again!");

        String[] splitString = "Hello World again".split(" ");// here we are splitting the words using space, but you can split them also by using some letter or some other symbols
        printText(splitString);

        System.out.println("_".repeat(20));
        printText("Hello");

        System.out.println("_".repeat(20));
        printText("Hello", "World", "again", "!");

        String[] sArray = {"first", "second", "third", "fourth", "fifth"};
        System.out.println(String.join(", ", sArray));// using ".join" method
    }

    public static void printText(String... textList) {
        for (String t : textList) {
            System.out.println(t);
        }
    }
}
