import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();

        if(A*N<=B){
            System.out.println(A * N);
        }
        else{
            System.out.println(B);
        }
    }
}