import static org.hamcrest.CoreMatchers.either;

import java.util.*;

class Main {
	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		in.nextLine();
		for (int i = 0; i < N; i++) {
			long rest=in.nextLong();
			long buy=in.nextLong();
			long min=in.nextLong();
			long add=in.nextLong();
			if(buy>rest||buy>add) {
				System.out.println("No");
				continue;
			} else if(buy<min && add>buy) {
				System.out.println("Yes");
				continue;
			}
			add=add%buy+buy;
			rest=rest%buy+buy;
			HashSet<Long> restLog=new HashSet<>();
			restLog.add(rest);
			while(buy<=rest) {
				rest-=buy;
				if(rest<=min) {
					rest+=add;
				}
				if(!restLog.add(rest)) {
					break;
				}
				System.err.println("rest"+rest);
			}
			if(buy>rest) {
				System.out.println("No");
			}else {
				System.out.println("Yes");
			}
		}
		in.close();
	}
}