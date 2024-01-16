package pattern;

import java.util.Scanner;

public class pattern9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while (i<=n) {
            int j = 1;
            while (j<=i) {
                char jthchar = (char)('A' + i -1);
                System.out.print(jthchar);
                j++;
            }
            System.out.println();
            i++;
        }
        sc.close();
    }
}
