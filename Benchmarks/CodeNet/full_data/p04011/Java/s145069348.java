import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int k=sc.nextInt();
    int x=sc.nextInt();
    int y=sc.nextInt();
    sc.close();
    int fee=0;

    if(n<=k){
      fee=x*n;
    }else{
      fee=x*k+y*(n-k);
    }
    System.out.println(fee);
  }
}