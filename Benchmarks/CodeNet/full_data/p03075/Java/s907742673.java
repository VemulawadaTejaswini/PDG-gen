import java.util.*;

public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        for (int i = 0; i<5; i++) {
            a[i] = sc.nextInt();
        }
        int th = sc.nextInt();

        int diff = a[4] - a[0];

        if (diff > th) {
        System.out.println(":(");
        sc.close();
        }
        else {
        System.out.println("Yay!");
        sc.close();

        }

       sc.close();
    }
}