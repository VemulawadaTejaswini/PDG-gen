import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] x = new int[m];
		for(int i = 0; i < m; i++){
			x[i] = sc.nextInt();
		}
		if(m == 1){
			System.out.print(0);
		}else{
		Arrays.sort(x);
		n--;
		int num = 0;
		int[] x2 = new int[m-1];
		for(int i = 0; i < m-1; i++){
			x2[i] = x[i+1] - x[i];
			num += x2[i];
		}
		Arrays.sort(x2);
		for(int i = 0; i < n; i++){
			num -= x2[m-2-i];
		}
		System.out.print(num);
		}
	}
}
