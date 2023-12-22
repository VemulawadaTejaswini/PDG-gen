import java.util.*;
 
public class Main {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int x=1;
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