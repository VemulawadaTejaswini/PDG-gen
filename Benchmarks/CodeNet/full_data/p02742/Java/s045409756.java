import java.util.*;
 
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	long h,w;
    h=sc.nextInt();
    w=sc.nextInt();
    long sum=0;
    if((h%2)==0){
      sum=(h/2)*w;
    }else{
      for(long i=1;i<=w;i++){
        if((i%2)==0){
          sum+=((h-1)/2);
        }else{
          sum+=((h+1)/2);
        }
      }
    }
    System.out.print(sum);
  }
}