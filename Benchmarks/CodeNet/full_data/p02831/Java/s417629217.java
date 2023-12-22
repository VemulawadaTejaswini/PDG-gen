import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int a1=0,b1=0,x=0;
    int ans = 0;

    a1=Math.max(a, b);
    b1=Math.min(a, b);

    x=gcd(a1,b1);
    ans=(a1*b1)/x;
    System.out.println(ans);
  }
 public static int gcd(int a,int b) {
	 int r=0;
	 while(b!=0) {
		 r=a%b;
		 a=b;
		 b=r;
	 }
	 return a;}
}