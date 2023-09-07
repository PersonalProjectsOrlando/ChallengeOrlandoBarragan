/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChallengeTwo;
import ChallengeOne.Digits;
import static ChallengeOne.Digits.orderNumber;
import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Orlando B
 */
//[0,44]
public class ArraySquare {

    public static void main(String[] args) {
        int[] arrayNumbers = new int[10];
        System.out.println("Numbers Generate: ");
        FillArray1(arrayNumbers);

        System.out.println("Numbers Square:");
        arraySquare(arrayNumbers);

    }

    public static int[] FillArray1(int[] arrayNumbers) {
        int count1 = 0;
        int count2 = 0;

        Random random = new Random();
        for (int n = 0; n < arrayNumbers.length; n++) {
            int RandomNumber = random.nextInt(5 + 6) - 5;
            arrayNumbers[n] = RandomNumber;
            count1++;
        }
        orderNumber(arrayNumbers);
        for (int i = 0; i < arrayNumbers.length; i++) {
            if (arrayNumbers[i] != 0) {
                System.out.print(arrayNumbers[i] + " ");

            }
            count2++;
        }

        System.out.println("");
        System.out.println("Count Generate: " + count1);
        System.out.println("Count Read: " + count2);
        System.out.println("");
        return arrayNumbers;
    }

    public static void arraySquare(int[] arrayNumbers) {
        double square = 0;
        int countSquare = 0;
        int[] arraySquare = new int[10];
        for (int i = 0; i < arrayNumbers.length; i++) {
            square = Math.pow(arrayNumbers[i], 2);
            if (square < 44 && arrayNumbers[i] != 0) {
                arraySquare[i] = (int) square;
            }
        }
        orderNumber(arraySquare);
        for (int j = 0; j < arraySquare.length; j++) {
            if (arraySquare[j] != 0) {
                System.out.print(arraySquare[j] + " ");
            }
        }
        System.out.println("");
    }
}
