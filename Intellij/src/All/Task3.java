package All;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
      
        int[] nums = new int[3];
        System.out.print("\nInput three numbers: \n");
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 3; i++){
            nums[i] = in.nextInt();
        }
        System.out.print("\nNumbers: ");
        for(int i = 0; i < 3; i++){
            System.out.print(nums[i] + " ");
        }
    }
}
