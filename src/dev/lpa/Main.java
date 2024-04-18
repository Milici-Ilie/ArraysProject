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

        //////////// Array inside of bracket and separate by comma ///////////////////

        System.out.println();
        System.out.println(Arrays.toString(newArray)); //output => [5, 4, 3, 2, 1]

        //////////////////////// 📲📲 [Arrays.sort.fill.copyOf] 📲📲 ////////////////////////////////
        //////////////////////// 📲📲 [Arrays.sort.fill.copyOf] 📲📲 ////////////////////////////////
        //////////////////////// 📲📲 [Arrays.sort.fill.copyOf] 📲📲 ////////////////////////////////

        int[] firstArray = getRandomArray(10);
        System.out.println(Arrays.toString(firstArray));//output => [ xx, yy, zz, etc...]
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
}
