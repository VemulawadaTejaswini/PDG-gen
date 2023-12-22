import java.util.*;

public class Main {
	public static void main(String... args){
		Scanner sc = new Scanner(System.in);
		String N = sc.nextLine();
		int n = Integer.valueOf(N);
		int[] B= new int[n];
		for(int i=0;i<n;i++){
			String a = sc.nextLine();
			int b = Integer.valueOf(a);
			if(b<i){
				System.out.prinltln(-1);
				break;
			}
				for (i = n+1;i>b;i--){
					B[i] =B[i-1];
				}
				B[b] = b;
		}
		for (i=0;i<n;i++){
			System.out.println(B[i]);
		}


	}
}
