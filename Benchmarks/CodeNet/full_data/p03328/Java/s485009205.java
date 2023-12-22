import java.util.*;

public class NewClass1 {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int x=2;
        int b=0;
        while(n>b){
            b=x*(x+1);
            //System.out.println("b="+b);
            b/=2;
            //System.out.println("b="+b+" x="+x);
            x++;
        }
        System.out.println(b-n);

    }
}