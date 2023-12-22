import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		boolean contains = false;
		ArrayList<Integer> nums = new ArrayList<>();
		boolean firsttime = true;
		boolean truth = false;
		for(int i=0;i<n;i++) {
			int b = sc.nextInt();
			if(nums.indexOf(b)==-1) {
				nums.add(b);
			}
			else {
				if(firsttime) {
					truth=true;
					firsttime=false;
				}
			}
		}
		if(truth) {
			System.out.println("NO");
		}
		else {
			System.out.println("YES");
		}
	}
}