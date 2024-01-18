package pattern;

import java.util.Scanner;

public class pattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while (i<=n) {
            int j = 1;
            char k = (char)(i);
            while (j<=i) {
                System.out.print((char)(64+k));
                k = (char)(k+1);
                j=j+1;
            }
            System.out.println();
            i++;
        }
        sc.close();
    }
}
