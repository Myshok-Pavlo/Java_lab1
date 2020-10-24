package All.Task4_p;
import java.util.Scanner;

/** Main class that contains input point(main)*/
public class Task4 {
    int min, max;
    public static void main(String[] args) {
        HelpClass test = new HelpClass();

        test.input();
        test.printOdd();
        test.printPair();
        test.printSums();
        test.printFibonacciNumbers();
        test.printPercentage();
    }
}
