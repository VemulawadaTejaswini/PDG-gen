import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long n=sc.nextInt(),m=sc.nextInt();
    long sum=0;
    for(long i=0;i<m;i++)sum+=sc.nextLong();
    System.out.println(Math.max(n-sum, -1));
    
  }
}
