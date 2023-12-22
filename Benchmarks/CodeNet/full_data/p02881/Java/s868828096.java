import java.util.*;
public class Main{
  public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    long N = sc.nextLong();
    long min=N;
    long x=0;
    long y=0;
    for(int i=1;i*i<=N;i++){
      if(N%i==0){
        x=i-1;
        y=N/i-1;
       min=Math.min(min,x+y);
      
     }
    }
    System.out.println(min);
  }
}
