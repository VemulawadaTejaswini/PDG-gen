import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int a = Math.max(A,B);
        int b = Math.min(A,B);
        int ans = Math.max(2*a-1,a+b);
        System.out.println(ans);
    }
}