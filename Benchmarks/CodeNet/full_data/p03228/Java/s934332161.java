import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int K = sc.nextInt();
        for (int i = 0; i < K / 2; i++) {
            if (A % 2 == 0) {
                B = B + (A / 2);
                A = A / 2;
                
            } else {
                A = A - 1;
                B = B + (A / 2);
                A = A / 2;
                
            }
            if (B % 2 == 0) {
                A = A + (B / 2);
                B = B / 2;
                
            } else {
                B = B - 1;
                A = A + (B / 2);
                B = B / 2;
                
            }
            
        }
        if(K % 2 != 0){
            if (A % 2 == 0) {
                B = B + (A / 2);
                A = A / 2;
                
            } else {
                A = A - 1;
                B = B + (A / 2);
                A = A / 2;
                
            }
        }
        System.out.println(A + " " + B);
    }
}