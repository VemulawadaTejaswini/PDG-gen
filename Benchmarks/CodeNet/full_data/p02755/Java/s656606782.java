import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int A=0;
        int B=0;
        A=sc.nextInt();
        B=sc.nextInt();
        double X = 0;
        double Y = 0;
        X=A/0.08;
        Y=B*10.0;
        if(-10.0<(X-Y) && (X-Y)<10.0){
            System.out.println((int)X);
        }else{
            System.out.println(-1);
        }
    }
}