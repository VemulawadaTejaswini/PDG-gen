import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<A> map = new ArrayList<>();
		int[] bolMap = new int[] { 25, 50 , 100, 200};
		for (int i = 0; i < 4; i++) {
			int val = sc.nextInt();
			map.add(new A(bolMap[i], val));
		}
		
		Collections.sort(map, (a1, a2) -> { return (a1.val * 100 / a1.bol <= a2.val * 100 / a2.bol) ? -1 : 1 ;} );
		
		long N = sc.nextLong() * 100;
		int index = 0;
		long ans = 0;
		while(N != 0) {
			if (N >= map.get(index).bol) {
				long shou = N / map.get(index).bol;
				N -= map.get(index).bol * shou;
				ans += map.get(index).val * shou;
			} 
			index++;
		}
		
		System.out.println(ans);
	}
	
	static class A {
		long bol;
		long val;
		
		A(long bol, long val) {
			this.bol = bol;
			this.val = val;
		}
	}
}