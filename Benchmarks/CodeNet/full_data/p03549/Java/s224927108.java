import java.util.*;
public class Main {
	public static void main(String[] args)  {
		Scanner scan = new Scanner(System.in);
		int N = Integer.parseInt(scan.next());
		int M = Integer.parseInt(scan.next());
		System.out.println((long)((1900*M + 100*(N-M))*Math.pow(2, M)));
	}
}

//end