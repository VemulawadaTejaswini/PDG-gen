import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int result;
        
        if(A == 0) {
            result = 0;
        } else if (A + B < N) {
            result = A + (N - (A+B));
        } else {
            result = A;
        }

        System.out.println(result);
    }
}