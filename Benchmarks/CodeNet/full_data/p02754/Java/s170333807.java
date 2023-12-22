import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        String s = sc.next();
      	String[] nab = s.split(" ");
        int n = Integer.parseInt(nab[0]);
        int a = Integer.parseInt(nab[1]);
        int b = Integer.parseInt(nab[2]);
        int c = a+b;
      	int d = n%c;
      	if(d>a) d = a;
        int e = n/c;
        int f = e*a+d;
        System.out.println(f);
    }
 
}