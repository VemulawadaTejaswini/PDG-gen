import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Long> x=new ArrayList<>();
		int n=sc.nextInt();
		boolean can = true;
		
		for(int i=0;i<n;i++) {
			long m = sc.nextLong();
			if(!x.contains(m)) {
				x.add(m);
			}else {
				can = false;
				break;
			}
		}
		String s = can?"YES":"NO";
		System.out.println(s);
	}
}