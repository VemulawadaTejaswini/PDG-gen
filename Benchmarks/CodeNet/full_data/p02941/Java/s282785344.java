import java.util.Scanner;

public class Main {
	public static int[] a;
	public static int[] b;
	public static int n;


	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		a = new int[n];
		b = new int[n];
		for(int i = 0; i < n; i++){
			a[i] = sc.nextInt();
		}
		for(int i = 0; i < n; i++){
			b[i] = sc.nextInt();
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
				cnt = -1;
				break;
			}
			else if(b[index]>a[index]){
				cnt++;
			}
			else{
				cnt++;
				flg = true;
				for(int i = 0; i < n; i++){
					if(a[i]!=b[i]){
						flg = false;
						break;
					}
				}
				if(flg){
					break;
				}
			}
		}
		System.out.println(cnt);

	}

}