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
//		int j=0;
		for (int j=0; j<a; j=j+2){
			int c1 = n[j];
			int c2 = n[j+1];
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
		
		
	}

}
