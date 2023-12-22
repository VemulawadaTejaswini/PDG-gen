import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long q=sc.nextLong(),h=sc.nextLong(),s=sc.nextLong(),d=sc.nextLong();
    long n=sc.nextLong();
    long odd=Math.min(q*4, Math.min(h*2, s)),even=Math.min(odd*2, d);
    System.out.println((n/2)*even+(n%2)*odd);
  }
	public static boolean check(long a,long b,long c) {
		return true;
	}
}
