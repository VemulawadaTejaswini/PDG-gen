import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int a = Math.min(Math.min(A,B),C);
        int c = Math.max(Math.max(A,B),C);
        int b = (A + B + C) - (a + c);

        //bに合わせる
        int count = 0;
        if ((b - a)% 2 == 0) {
            count = (b - a)/2;
        }else{
            count = (b - a + 1)/2 + 1;
        }
        count = count + (c - b);

        System.out.println(count);
    }
}
