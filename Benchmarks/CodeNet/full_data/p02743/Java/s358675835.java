import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	long a = sc.nextLong();
	long b = sc.nextLong();
	long c = sc.nextLong();
	double ab = Math.sqrt(a) + Math.sqrt(b);
	double cc = Math.sqrt(c);
	if( ab<cc )
	    System.out.print("Yes");
	else
	    System.out.print("No");
    }
}
