import java.util.*;
import java.lang.Math;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int X = sc.nextInt();
        if(A > X){
            System.out.println("NO");
        }else if(X < A + B){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
    