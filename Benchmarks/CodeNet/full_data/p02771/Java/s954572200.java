import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int C = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();

        if(A == B && B == C){
            System.out.println("No");
        }else if(A != C && B != C){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }

    }
}

