import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int i=0;i<t;i++) {
			long a = in.nextLong();
			long b = in.nextLong();
			long c = in.nextLong();
			long d = in.nextLong();
			List<Long> stock = new ArrayList<>();
			if(judge(a,b,c,d,stock)) System.out.println("Yes");
			else System.out.println("No");
		}
	}
	
	public static boolean judge(long a,long b,long c,long d,List<Long> stock) {
		if(a<b) return false;
		else {
			if(a%b>c) return false;
			if(a%b+d<b) return false;
			else{
				if(stock.contains(a%b+d)) return true;
				else {
					stock.add(a%b+d);
					return judge(a%b+d,b,c,d,stock);
				}
			}
		}
	}

}