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
      if((w%2)==0){
        sum=(w/2)*h;
      }else{
        sum=((w-1)/2)*h+(w+1)/2;
    System.out.print(sum);
  }
}