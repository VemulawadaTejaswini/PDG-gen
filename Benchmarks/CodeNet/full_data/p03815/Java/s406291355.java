import java.util.*;
public class Main {
	public static void main(String[] args)  {
		Scanner scan = new Scanner(System.in);
		long x = Long.parseLong(scan.next());

		long ans = (long)Math.ceil(2.0*x/11);

		System.out.print(ans);
}
}
//end
