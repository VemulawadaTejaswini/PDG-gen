import java.util.*;

public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int K = sc.nextInt();
        sc.close();
        for (int i = 0; i < K; i ++) {
            if(A%2 == 1)A--;
            B += A/2;
            if(B%2 == 1)B--;
            A += B/2;            
        }
        System.out.println(A + " " + B);
    }
}