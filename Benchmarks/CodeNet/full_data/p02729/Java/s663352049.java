import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	int n,m,nf,mf;
    n=sc.nextInt();
    m=sc.nextInt();
    nf=n*(n-1)/2;
    mf=m*(m-1)/2;
    System.out.print((nf+mf));
  }
}