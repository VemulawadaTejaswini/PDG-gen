import java.util.Scanner;

public class Main099 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        int count4 = 0;
        int count2 = 0;
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextLong();
            if(a[i] % 4 == 0) {
                count4++;
            } else if(a[i] % 2 == 0) {
                count2++;
            } else {
                count++;
            }
        }

        double b = Math.ceil((n -1) / 2.0);
        double c = b - count4;
        if(b <= count4) {
            System.out.println("Yes");
        } else if(n == count2){
            System.out.println("Yes");
        } else if (count2 > c){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}