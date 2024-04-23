package dev.lpa;

import java.util.Arrays;
import java.util.Random;

//🛬🛬 [Arrays] 🛬🛬 🛬🛬 [Arrays] 🛬🛬
public class Main {

    public static void main(String[] args) {

        int[] myIntArray = new int[10];
        myIntArray[5] = 50;

        double[] myDoubleArray = new double[10];
        myDoubleArray[2] = 3.5;

        System.out.println(myIntArray[5]);
        System.out.println(myDoubleArray[2]);

        //================================

        int[] firstTen = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("first = " + firstTen[0]);
        int arrayLength = firstTen.length;
        System.out.println("Length of array = " + arrayLength);

        System.out.println("Last number = " + firstTen[arrayLength - 1]);

        //========LOOP===========

        int[] newArray;
//        newArray = new int[]{5, 4, 3, 2, 1};
        newArray = new int[5];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = newArray.length - i;// here we are displaying the Array numbers in reverse order without numbering all the numbers ourselves
        }
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
        System.out.println();

        //////////// ENHANCED FOR LOOP ///////////////

        for (int element : newArray) {
            System.out.print(element + " ");
        }

        //////////// Array inside of bracket and separated by comma ///////////////////

        System.out.println();
        System.out.println(Arrays.toString(newArray)); //output => [5, 4, 3, 2, 1]

        //////////////////////// 📲📲 [Arrays.sort.fill.copyOf] 📲📲 ////////////////////////////////
        //////////////////////// 📲📲 [Arrays.sort.fill.copyOf] 📲📲 ////////////////////////////////
        //////////////////////// 📲📲 [Arrays.sort.fill.copyOf] 📲📲 ////////////////////////////////

        int[] firstArray = getRandomArray(10);
        System.out.println(Arrays.toString(firstArray));//output => [ xx, yy, zz, etc...]
        Arrays.sort(firstArray);
        System.out.println(Arrays.toString(firstArray));// SORTING the numbers from Array

        int[] secondArray = new int[10];
        System.out.println(Arrays.toString(secondArray));
        Arrays.fill(secondArray, 5);//here we are mutating all the elements in the Array to be "5"
        System.out.println(Arrays.toString(secondArray));

        int[] thirdArray = getRandomArray(10);
        System.out.println(Arrays.toString(thirdArray));

        int[] fourthArray = Arrays.copyOf(thirdArray, thirdArray.length);// "copyOf" method and we also need to specify the size of the Array that we want to copy "...length"
        System.out.println(Arrays.toString(fourthArray));//copy of the "thirdArray" 👆
        Arrays.sort(fourthArray);//sorting the Array
        System.out.println(Arrays.toString(fourthArray));//displaying the sorted Array

        int[] smallArray = Arrays.copyOf(thirdArray, 5);//printing a smaller Array
        System.out.println(Arrays.toString(smallArray));//displaying only the first 5 numbers from the "thirdArray"

        int[] largerArray = Arrays.copyOf(thirdArray, 15);
        System.out.println(Arrays.toString(largerArray));//displaying the normal Array + 5 more numbers which are 0, because the original Array has only 10 elements
        System.out.println();

        //////////////////////// 🔎🔎 [BINARY SEARCH] 🔎🔎 ////////////////////////////////
        //////////////////////// 🔎🔎 [BINARY SEARCH] 🔎🔎 ////////////////////////////////
        //////////////////////// 🔎🔎 [BINARY SEARCH] 🔎🔎 ////////////////////////////////

        String[] sArray = {"Abel", "Jane", "Cain", "Mihail", "Gavril", "David"};
        Arrays.sort(sArray);
        System.out.println(Arrays.toString(sArray));
        if (Arrays.binarySearch(sArray, "Cain") >= 0) {
            System.out.println("Found Cain in the list");//searching an element inside of Array
        }

        int[] s1 = {1, 2, 3, 4, 5};
        int[] s2 = {1, 2, 3, 4, 5};
        if (Arrays.equals(s1, s2)) {//EQUALS Arrays ===
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");
        }
        System.out.println("CHALLENGE");
        System.out.println("CHALLENGE");
        System.out.println("CHALLENGE");

        //////////////////////////CHALLENGE---reverse numbers{array}//////////////////////////////////
        //////////////////////////CHALLENGE---reverse numbers{array}//////////////////////////////////
        //////////////////////////CHALLENGE---reverse numbers{array}//////////////////////////////////

        int[] challengeArray = reverseArray(5);
        System.out.println(Arrays.toString(challengeArray));
        Arrays.sort(challengeArray);
        System.out.println(Arrays.toString(challengeArray));

        for (int i = challengeArray.length - 1; i >= 0; i--) {
            System.out.print(challengeArray[i] + " ");// here we are displaying the Array numbers in reverse order without numbering all the numbers ourselves
        }

        System.out.println();
        System.out.println("-".repeat(20));

        //////////////////////////🔅🔅 [DIMENSIONAL ARRAY] 🔅🔅//////////////////////////////////
        //////////////////////////🔅🔅 [DIMENSIONAL ARRAY] 🔅🔅//////////////////////////////////
        //////////////////////////🔅🔅 [DIMENSIONAL ARRAY] 🔅🔅//////////////////////////////////


        int[][] array2 = new int[4][4];
        System.out.println(Arrays.toString(array2));
        System.out.println("array2.length = " + array2.length);

        for (int[] outer : array2) {
            System.out.println(Arrays.toString(outer));
        }

        for (var outer : array2) {
            for (var element : outer) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    //////////////////////// 📲📲 [Arrays.sort.fill.copyOf] 📲📲 ////////////////////////////////
    //////////////////////// 📲📲 [Arrays.sort.fill.copyOf] 📲📲 ////////////////////////////////
    //////////////////////// 📲📲 [Arrays.sort.fill.copyOf] 📲📲 ////////////////////////////////

    public static int[] getRandomArray(int len) {

        Random random = new Random();//this is the "Random()" java.util library
        int[] newInt = new int[len];
        for (int i = 0; i < len; i++) {
            newInt[i] = random.nextInt(100);
        }//here we created a method that will return 10 Random numbers in the length from [0 - 100]

        return newInt;
    }

    public static int[] reverseArray(int len) {

        Random random = new Random();//this is the "Random()" java.util library
        int[] newInt = new int[len];
        for (int i = 0; i < len; i++) {
            newInt[i] = random.nextInt(1000);
        }//here we created a method that will return 10 Random numbers in the length from [0 - 100]

        return newInt;
    }
}
