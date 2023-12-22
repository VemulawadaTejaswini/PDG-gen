import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    long N=sc.nextLong();
    long counter=0;
    for(long K=2;K<=N;K++){ 
      long n=N;
      while(n>=K){       
        if(n%K==0) n=n/K;
        else n-=K;
      }
      if(n==1) counter++;
    }
   System.out.println(counter);
   }
}