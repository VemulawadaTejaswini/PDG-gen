import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int result = 0;
        if (A == B) {
            result = C;
        }else if(A == C){
            result = B;
        }else{
            result = A;
        }
        System.out.println(result);

    }
}
