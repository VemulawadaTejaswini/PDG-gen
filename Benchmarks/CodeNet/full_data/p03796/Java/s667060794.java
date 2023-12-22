import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        double N=sc.nextInt();
        double a=1;
        double b=Math.pow(10,9)+7;
        for(long i=1;i<=N;i++){
            a=a*i%b;
            if(i==N){
                System.out.println(a);
            }
        }
        
        
     
    }
}