import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        if(A == B){
            System.out.println(C);
            return;
        }
        if(B == C){
            System.out.println(A);
            return;
        }
        if(A == C){
            System.out.println(B);
        }
    }
}