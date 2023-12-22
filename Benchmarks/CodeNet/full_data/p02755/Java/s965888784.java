import java.util.*;
public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        double x = Math.floor(12.5*A);
        double y = Math.floor(x*0.1);
        if(B==y) System.out.println((int)x);
        else System.out.println(-1);
    }
}