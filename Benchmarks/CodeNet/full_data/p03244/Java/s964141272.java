import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int n[] = new int[a];
		
		for (int i=0; i<a; i++){
			n[i] = sc.nextInt();
		}
		
		int ttl[] = new int[a/2];
		for (int i=0; i<ttl.length; i++){
			ttl[i] = 0;
		}
		for (int j=0; j<a; j++){
			if (j%2 !=0){
				continue;
			}
			
			int c1 = n[j];
			int c2 = n[j+1];
//			boolean f = false;
//			if (c1 == c2){
//				c2++;
//				f = true;
//				System.out.println(f);
//			}
			int sum = 0;
			for (int i=0; i<a; i=i+2){
				
				if (c1 != n[i]){
					sum++;
				}
				if (c2 != n[i+1]){
					sum++;
				}
				if (c1 == c2){
					sum++;
				}
			}
			if (j == 0){
				ttl[j] = sum;
			}
			else {
				ttl[j/2] = sum;
			}
		}
		
		Arrays.sort(ttl);
		System.out.println(ttl[0]);
		
//		int b1 = n[0];
//		int b2 = n[1];
//		boolean f = false;
//		if (b1 == b2){
//			b2++;
//			f = true;
//		}
//		int sum = 0;
//		for (int i=0; i<a; i=i+2){
//			
//			if (b1 != n[i]){
//				sum++;
//			}
//			if (!f){
//				if (b2 != n[i+1]){
//					sum++;
//				}
//			}
//			else {
//				if (b2 != n[i+1]+1){
//					sum++;
//				}
//				
//			}
//			
//		}
//		System.out.println(sum);
		
	}

}
