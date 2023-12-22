import java.util.Scanner;

public class Main{
    static long lcm (long a, long b) {
	     long temp;
	      long c = a;
	       c *= b;
	        while((temp = a%b)!=0) {
  		        a = b;
		            b = temp;
  	           }
	     return (long)(c/b);
     }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    long a=scanner.nextLong();
    long b=scanner.nextLong();
    long c=scanner.nextLong();
    long d=scanner.nextLong();
    //int a[]=new int[n];

    //System.out.println(a);
    long bc,bd,ac,ad;
    bc=b/c;
    bd=b/d;
    ac=(a-1)/c;
    ad=(a-1)/d;
    long num1,num2;
    num1=bc-ac;
    num2=bd-ad;
    long scd;
    long bscd,ascd;
    scd=lcm(c,d);
    bscd=b/scd;
    ascd=(a-1)/scd;
    long num3;
    num3=bscd-ascd;

    long cnt=b-a+1-num1-num2+num3;
    //System.out.println(b+"-"+a+"-"+num1+"-"+num2+"+"+num3);
    System.out.println(cnt);
  }
}
