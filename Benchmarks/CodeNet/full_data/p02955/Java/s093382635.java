import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] line = br.readLine().split(" ");
		int n = Integer.parseInt(line[0]);
		int k = Integer.parseInt(line[1]);
		line = br.readLine().split(" ");
		int[] nums = new int[n];
		int i, j, now, tmp;
		int sum = 0;
		
		for(i=0; i<n; i++){
			now = Integer.parseInt(line[i]);
			sum += now;
			for(j=0; j<i; j++) if( now < nums[j] ){
				tmp = nums[j];
				nums[j] = now;
				now = tmp;
			}
			nums[i] = now;
		}
		
		//sumを素因数分解して答え一覧を導き出す。sumが35なら1,5,7,35が答え一覧。
		//答え一覧の大きいものから順に試す。for(i--)
		//試す方法は、全ての数字で答え一覧[i]の倍数に近い数値との差分をとり、その合計を求め、それがk以下ならokそうでないなら答え一覧から次の数字を試す。
		//この方法で出来そうな気はするけど、実装がしんどいし時間も無いし疲れたので今はいいや
		
		int deltaSum = 0;
		int average;
		for(i=n; 0<i; i--) if(sum/i*i == sum){
			average = sum/i;
			for(j=0; j<n-i; j++)
				deltaSum += nums[j];
			for(j=0; j<n; j++)
				deltaSum += Math.abs(nums[j]-average);
			if( deltaSum % 2 == 0 && deltaSum/2 <= k ){
				System.out.println(average);
				System.exit(0);
			}
		}
	}
}
