import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		//入力表示

		int N = sc.nextInt();
		double[]v=new double[N];
		
		for(int i=0;i<N;i++) {
			v[i]=sc.nextInt();
		}
		//昇順に並べる
		Arrays.sort(v); 
		
		double ans =v[0];
		
		for(int i=1;i<N;i++) {
			ans=(ans+v[i])/2;
		}
		System.out.println(ans);
     
    }
}