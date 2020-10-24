package All.Task4_p;

import java.util.Scanner;

/** Help class - class, that contains all methods for Lab1
 * @author Mykola Kudla
 * @version v0.0.1
 *
 * */
public class HelpClass{
    /** Min and Max value*/
    private int min, max;
    /** Array for storing Fibonacci numbers*/
    private int[] fibonacciNumbers;

    /** Method for assigning min and max variables*/
    public void input(){
        Scanner in = new Scanner(System.in);
        System.out.print("Input min number: ");
        min = in.nextInt();
        System.out.print("\nInput max number: ");
        max = in.nextInt();

        if(max < min){
            int tmp = max;
            max = min;
            min = tmp;
        }
    }

    /**Prints odd numbers*/
    public void printOdd(){
        System.out.print("\nOdd numbers: ");
        for (int i = min; i <= max; i++){
            if(i % 2 != 0){
                System.out.printf("%d ", i);
            }
        }
    }
    /**Prints pair numbers backwards*/
    public void printPair(){
        System.out.print("\nOdd numbers: ");
        for (int i = max; i >= min; i--){
            if(i % 2 == 0){
                System.out.printf("%d ", i);
            }
        }
    }
    /**Prints sum of odd and pair numbers*/
    public void printSums(){
        int oddSum = 0, pairSum = 0;

        for (int i = min; i <= max; i++){
            if(i % 2 != 0){
                oddSum += i;
            }
            else
                pairSum += i;
        }

        System.out.printf("\nOdd sum: %d\nPair sum: %d", oddSum, pairSum);
    }

    /** This method prints Fibonacci numbers that starts of biggest odd and biggest pair*/
    public void printFibonacciNumbers(){
        System.out.print("\nInput fibonacci numbers length: ");
        int length = new Scanner(System.in).nextInt();
        fibonacciNumbers = new int[length];

        int biggestOdd, biggestPair;
        if(max % 2 != 0){
            biggestOdd = max;
            biggestPair = max -1;
        }
        else{
            biggestPair = max;
            biggestOdd = max -1;
        }

        fibonacciNumbers[0] = biggestOdd;
        fibonacciNumbers[1] = biggestPair;

        printFibonacciNumbersRecursive(biggestOdd, biggestPair, length - 2);

        System.out.print("\nFibonacci numbers: ");
        for(int n : fibonacciNumbers){
            System.out.printf("%d ", n);
        }
    }

    /** This method recursively finds Fibonacci numbers and print them
     * @param num1 - first num
     * @param num2 - seccond num
     * @param length - length of fibonacci list
     * */
    private void printFibonacciNumbersRecursive(int num1, int num2, int length){
        if(length <= 0)
            return;

        fibonacciNumbers[fibonacciNumbers.length -  length] = num1 + num2;
        printFibonacciNumbersRecursive(num2, num1 + num2, length-1);
    }

    /** This method prints percentage of add and pair numbers in Fibonacci list*/
    public void printPercentage(){
        int oddCount = 0;
        for (int n : fibonacciNumbers){
            if(n % 2 != 0){
                oddCount++;
            }
        }

        double oddPercentage = (double)oddCount * 100 / fibonacciNumbers.length;
        System.out.printf("\nOdd percentage - %f", oddPercentage);
        System.out.printf("\nPair percentage - %f", 100 - oddPercentage);
    }
}
