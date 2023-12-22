import java.util.Scanner;
public class Main{

	static int []a;
	static int ans;
	static int count;
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);		//入力
		int n = sc.nextInt();				//入力したのをint型に変換
		sc.close();
		a = new int [4];
		System.out.println("nは"+n);
		for(int i = 0;i < 4;i++){
			int m = 1;
			System.out.println("mは"+m);
			for(int j = 3-i;j >0;j--){
				m *= 10;
			}
			a[i] = n/m;				//配列にそれぞれの桁の値を入れる
			n -= a[i]*m;
		}
		count = 0;
		boolean s = false;
		for(int i = 0;i < 4;i++){
			if(a[i] == a[i+1]){
				count++;
				if(count == 2){
					s = true;
				}
			}else if(i > 0){
				count--;

			}
		}
		if(s == true){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}



}
