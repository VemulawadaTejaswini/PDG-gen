import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 整数の入力
		int n = sc.nextInt();

		long[] task = new long[n];
		long mod = 10000000000l;

		for(int i=0;i<n;i++)task[i]=(sc.nextLong()+sc.nextLong()*mod);

		Arrays.sort(task);
		long sum = 0;
		boolean flg = true;

		for(int j=0;j<n;j++){
			sum += task[j]%mod;
			if(sum>task[j]/mod){
				flg = false;
				break;
			}
		}

		// 出力
		System.out.println(flg?"Yes":"No");
	}
}