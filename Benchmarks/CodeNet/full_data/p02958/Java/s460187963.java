package atcoder;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int i = 0;
		int j = 0;
		int k = 0;
		int flag = 0;
		int baf = 0;
		int[] Li = new int [5];
		int[] Li2 = new int[5];
		for(i=0;i<N;i++) {
			Li[i] = scanner.nextInt();
		}

		
		for(i=0;i<N;i++) {
			for(j=i+1;j<N;j++) {
				System.arraycopy(Li, 0, Li2, 0, N);
				baf = Li2[i];
				Li2[i] = Li2[j];
				Li2[j] = baf;
				flag = 0;
				for(k=0;k<N;k++) {
					System.out.print(Li[k]);
				}
				for(k=0;k<N-1;k++) {
					
					if(Li2[k] > Li2[k+1]) {
						flag  = -1;
						break;
						
					}
					
				}
				if(flag == 0) {
					flag = 1;
					break;
				}
				
			}
			if(flag == 1) {
				break;
			}
		}
		if (flag == 1) {
			System.out.print("Yes");
		}else {
			System.out.print("No");
		}
	}
}
