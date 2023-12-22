import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		long n = Long.parseLong(sc.next());
      	long a = Long.parseLong(sc.next());
      	long b = Long.parseLong(sc.next());
      	if(a==0){
        	System.out.println(0);
          return;
        }
        long c = a+b;
      	long d = n%c;
      	if(d>a) d = a;
        long e = n/c;
        long f = e*a+d;
        System.out.println(f);
    }
 
}