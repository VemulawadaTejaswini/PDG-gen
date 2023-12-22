import java.util.*;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
	
		int N = keyboard.nextInt();
		
		int[]A = new int[N];
		Set<Integer> sp = new HashSet<Integer>();
		
		for(int i = 0; i<N; i++) {
			A[i] = keyboard.nextInt();
			sp.add(A[i]);
		}
		
		boolean flag = false;  
	
//			Nが３の倍数個であるとき
		if(N % 3 == 0) {
//				aが３種類であるとき
			if(sp.size() == 3) {
//					a1^a2 == a3である、かつ各aの個数が等しい
				Integer[]a = sp.toArray(new Integer[0]);
				if((a[0]^a[1]) == a[2]) {
					Arrays.sort(A); 
					if(A[0] == A[N/3-1] && A[N/3] == A[2*N/3-1] && A[2*N/3] == A[N-1]) {
						flag = true;
					}
				}
			}else if(sp.size() == 2){
//				aが２種類であるとき
				Integer[]a = sp.toArray(new Integer[0]);
				if(a[0]== 0) {
					Arrays.sort(A); 
					if(A[0] == A[N/3-1] && A[N/3] == A[N-1]) {
						flag = true;
					}
				}
			}else if(sp.size() == 1){
//					aが1種類であるとき1、aは必ず０でないといけない
				if(A[0] == 0) {
					flag = true;
				}
			}
		}

		String ans = "";
		if(flag) {
			ans = "Yes";
		}else {
			ans = "No";
		}
		
		System.out.println(ans);
		keyboard.close();	
	}
}
