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
			if(a<b) {
				System.out.println("No");
			}else if(a%b>c){
				System.out.println("No");
			}else if(a%b+d<b) {
				System.out.println("No");
			}
			List<Long> stock = new ArrayList<>();
			if(judge(a,b,c,d,stock)) System.out.println("Yes");
			else System.out.println("No");
		}
	}
	
	public static boolean judge(long a,long b,long c,long d,List<Long> stock) {
		long s = a%b+d;
		if(stock.contains(s)) return true;
		else {
			stock.add(s);
			return judge(s,b,c,d,stock);
		}
	}

}