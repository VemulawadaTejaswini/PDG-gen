import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
//		int n = 0;
//		List<Integer> a = new ArrayList<Integer>();
		int[] a = null;
		try(Scanner sc = new Scanner(System.in)){
			// N入力 aスペース区切り入力
//			System.out.println("Please Input N And a");
			a = new int[sc.nextInt()];
			for(int i = 0; i < a.length; i ++) {
//				a.add(aIn);
//				int aIn = sc.nextInt();
				a[i] = sc.nextInt();
			}
		}
		
		// 前提
//		if(n != a.size()) {
//			return;
//		}
		
		// a要素の4の倍数カウント
		int cnt4 = 0;
		// a要素の2の倍数カウント
		int cnt2 = 0;
		for(int i = 0; i < a.length; i++) {
			
			// 要素が4の倍数
//			if(a.get(i) % 4 == 0) {
			if(a[i] % 4 == 0) {
				cnt4++;
			}
			// 要素が2の倍数
//			else if(a.get(i) % 2 == 0) {
			else if(a[i] % 2 == 0){
				cnt2++;
			}
		}
		// 2の倍数の数を要素数から排除
//		n -= cnt2;
		int n = a.length - cnt2;
		
		// 2の倍数が存在した
		if(cnt2 != 0){
			// 偶数
			if(n % 2 == 0) {
				// 4の倍数が要素の半分以上
				if((n /2) <= cnt4) {
					System.out.println("YES");
				} else {
					System.out.println("NO");
				}				
			} else {
				// 4の倍数が要素の半分より上
				if((n /2) < cnt4) {
					System.out.println("YES");
				} else {
					System.out.println("NO");
				}				
			}
		} else {
			// 4の倍数が要素の半分以上
			if((n /2) <= cnt4) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}
