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
			HashSet<Long> restLog=new HashSet<>();
			restLog.add(rest);
			while(buy<=rest) {
				rest-=(rest/buy)*buy;
				if(rest<=min) {
					rest+=add;
				}
				if(!restLog.add(rest)) {
					break;
				}
			}
			System.err.println(i);
			if(buy>rest) {
				System.out.println("No");
			}else {
				System.out.println("Yes");
			}
		}
		in.close();
	}
}