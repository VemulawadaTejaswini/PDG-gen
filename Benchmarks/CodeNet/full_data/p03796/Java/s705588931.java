import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        long N=sc.nextInt();
        long a=1;
        long b=10*10*10*10*10*10*10*10*10+7;
        for(long i=1;i<=N;i++){
            a=a*i%b;
            if(i==N){
                System.out.println(a);
            }
        }
        
        
     
    }
}