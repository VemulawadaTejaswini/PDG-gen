import java.util.*;


public class Main{
    static long count=0;
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        long H=sc.nextLong();
        long sum=0;
        int i=0;
        while(H>sum){
            
            sum=sum+(long)Math.pow(2, i);
            i++;
        }
        //sum=sum+Math.pow(2, i);
        System.out.println(sum);
        
    }
}
