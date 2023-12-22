import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    int x=Math.abs(m-n);
    int y=0;

    if(x%2==0){
       y=x/2;
         if (n<m) {
         System.out.println(n+y);
       }else{
         System.out.println(m+y);
       }
     }

    if(x%2!=0){
      System.out.println("IMPOSSIBLE");
    }
  }
}
