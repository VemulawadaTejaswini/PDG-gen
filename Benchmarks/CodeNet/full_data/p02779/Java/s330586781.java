import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> x=new ArrayList<>();
		int n=sc.nextInt();
		boolean can = true;
		for(int i=0;i<n;i++) {
			int m=sc.nextInt();
			if(x.contains(m)) {
				can = false;
				break;
			}else {
				x.add(m);
			}	
		}
		String s = can?"YES":"NO";
		System.out.println(s);
	}
}