import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int now = 1;
		int break_brock = 0;
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = scan.nextInt();
		}
		for(int i=0;i<n;i++) {
			if(a[i] != now) {
				break_brock += 1;
			}else {
				now += 1;
			}
		}
		if(break_brock == n) {
			System.out.println(-1);
		}else {
			System.out.println(break_brock);
		}
		
	}
}


