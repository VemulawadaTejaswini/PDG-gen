import java.util.Scanner;

public class Main{
	
	static final Scanner s=new Scanner(System.in);
	
	public static void main(String[] __){
		long n=s.nextLong(),k=s.nextLong(),res=k;
		for(int i=1;i<n;i++)
			res*=k-1;
		System.out.println(res);
	}
}