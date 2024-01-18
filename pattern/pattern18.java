package pattern;

import java.util.Scanner;

public class pattern18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int row1 = (input+1)/2;
        int row2 = row1-1;
        for (int i = 1; i <=row1; i++) {
            for (int j = 1; j <= row1-i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <=2*i-1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = row2; i>=1; i--) {
            for (int j = 1; j <= row2-i+1; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <=2*i-1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
