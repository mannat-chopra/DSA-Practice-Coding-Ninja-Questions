package pattern;

import java.util.Scanner;

public class pattern15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while (i<=n) {
            int j = 1;
            while (j<=n-i) {
                System.out.print(" ");
                j++;
            }
            int k = 1;
            while (k<=i) {
                System.out.print(k);
                k++;
            }
            int dec = i-1;
            while (dec>=1){
                System.out.print(dec);
                dec--;
            }
            System.out.println();
            i++;
        }
        sc.close();
    }
}
