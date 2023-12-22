import java.util.Scanner;

public class Main {
	public static int[] a;
	public static int[] b;
	public static int[] c;
	public static int n;


	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		a = new int[n];
		b = new int[n];
		c = new int[n];
		for(int i = 0; i < n; i++){
			a[i] = sc.nextInt();
		}
		for(int i = 0; i < n; i++){
			b[i] = sc.nextInt();
		}
		for(int i = 0; i < n; i++){
			c[i] = 0;
		}
		int cnt = 0;
		boolean flg = true;
		int max, index, v ;

		while(true){
			max = b[0];
			index = 0;
			for (int i = 1; i < n; i++) {
			    v = b[i];
			    if (v > max) {
			        max = v;
			        index = i;
			    }
			}
			if(index==0){
				b[0] -= b[n-1] + b[1];
			}
			else{
			b[index] -= b[(index-1)%n] + b[(index+1)%n];
			}
			if(b[index]<a[index]){
				break;
			}
			else if(b[index]>a[index]){
				cnt++;
			}
			else{
				cnt++;
				c[index] = -1;
			}
		}
		flg = false;
		for(int i = 0; i < n; i++){
			if(c[i]==0){
				flg = true;
				break;
			}
		}
		if(flg){
			cnt = -1;
		}
		System.out.println(cnt);

	}

}