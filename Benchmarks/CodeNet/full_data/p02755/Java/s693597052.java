import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int A=0;
        int B=0;
        A=sc.nextInt();
        B=sc.nextInt();
        double X=0;
        double Y =0;
        X=A*25/2;
        Y=B*10;
        if(-10<(X-Y) && (X-Y)<10){
            System.out.println((int)X);
        }else{
            System.out.println(-1);
        }
    }
}