import java.util.Scanner;

public class Main {
	
	static Scanner sca = new Scanner(System.in);

	public static void main(String[] args)  {
		
		String sc = sca.next();
		long start = sc.indexOf("A");
		long last = sc.lastIndexOf("Z");
		
		long ans = last - start + 1;
		
		System.out.println(ans);
		

	}

}
