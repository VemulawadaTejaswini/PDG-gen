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
        //if(-10.0<(X-Y) && (X-Y)<10.0){
            String str=String.valueOf(X);
            String str2=String.valueOf(Y);
            if(str.charAt(0)==str2.charAt(0))
            System.out.println((int)X);
            else System.out.println(-1);
        /*}else{
            System.out.println(-1);
        }*/

    }
}