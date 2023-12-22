import java.util.*;
public class Main {
	public static void main(String[] args)  {
		Scanner scan = new Scanner(System.in);
		long x = Long.parseLong(scan.next());

		long ans = x/11;
		x-=ans*11;
		ans*=2;
		if (0 < x && x <= 6)ans+=1;
		else if (x<11)ans+=2;
		System.out.print(ans);
}
}
//end
