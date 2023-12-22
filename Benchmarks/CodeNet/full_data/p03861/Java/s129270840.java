import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long x = sc.nextLong();
		int m=0,n=0,l=0;
		for(;;){
		if(b % x == 0 && x<=b)continue;
		    m++;
		    b=b-x;
		
		if(a % x == 0 && x<=a)continue;
			n++;
			a=a-x;
	
		l = m-n;
		System.out.println(l);
		sc.close();
	}
}
}