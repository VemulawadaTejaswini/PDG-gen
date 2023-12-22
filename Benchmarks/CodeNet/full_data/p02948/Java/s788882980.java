import java.util.Scanner;

public class Main {
	public static int a[];
	public static int b[];
	public static int n;


	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int m = sc.nextInt();
		a = new int[n];
		b = new int[n];
		for(int i = 0; i < n; i++){
			a[i]  = sc.nextInt();
			b[i]  = sc.nextInt();
 		}
		System.out.println(max(m));
	}

	static int max(int c){
		int d = 0;
		if(c != 1){
		d = max(c-1);
		}
		int max = 0;
		int index = -1;

			for(int i = 0; i < n; i++){
				if(a[i]<=c && max < b[i]){
					max = b[i];
					index = i;
				}
			}
			if(index != -1){
				a[index] = 1;
				b[index] = 0;
			}
			return d + max;
	}

}