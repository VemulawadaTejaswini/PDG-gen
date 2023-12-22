import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count4 = 0;
        int count2 = 0;

        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            if (val % 4 == 0) {
                count4++;
            } else if (val % 2 ==0) {
                count2++;
            }
        }

        if (count4 * 3 >= n) {
            System.out.println("Yes");
        } else {
            int count = n - count4 * 3;
            if (count <= count2) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } else {
            System.out.println("No");
        }
        
    }
}