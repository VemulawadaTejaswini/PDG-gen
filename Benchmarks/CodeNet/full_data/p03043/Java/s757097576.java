import java.util.*;
public class Main{
    
    static int howmany(int K,int t){
        int count=0;
        while(t<K){
            t=t*2;
            count++;
        }
        return count;
    }
        
     public static void main(String []args){
         
       Scanner sc=new Scanner(System.in);
       int N=sc.nextInt();
       int K=sc.nextInt();
       int i=0;
       double prob=0;
       
       for(int j=1; j<=N; j++){
           double temp=1/(double)N * (double)1/Math.pow(2,howmany(K,j));
           prob=temp+prob;
           
       }
     System.out.println(prob);   
     }
     
}