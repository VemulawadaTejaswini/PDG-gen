import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int s;
        if(A==B){s = A * 2;}
        else {
            if (Math.max(A, B) == A) {
                s = 2 * A - 1;
            } else {
                s = 2 * B - 1;
            }
        }
        System.out.println(s);

    }
}
