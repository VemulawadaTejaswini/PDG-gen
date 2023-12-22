import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        long A = sc.nextLong();
        long B = sc.nextLong();
        long K = sc.nextLong();

        if (A >= K) {
            A = A - K;
        } else {
            if (B >= (K-A)){
                B = B - (K - A);
                A = 0;
            } else {
                B = 0;
                A = 0;
            }
        }
        System.out.println(A + " " + B);
    }
} 