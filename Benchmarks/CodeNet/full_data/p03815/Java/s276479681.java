import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x=sc.nextLong();
		long count=0;
		if(x>11){
			count+=2*x/11;
			x=x%11;
		}
		if(x>6)count+=2;
		else if(x>0) count++;
		
		System.out.println(count);
	}
}
