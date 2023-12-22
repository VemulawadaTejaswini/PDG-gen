import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String W = in.readLine();
		String[] D = W.split(" ");
		int MOD = 2019;

		long L = Long.parseLong(D[0]);
		long R = Long.parseLong(D[1]);

		long i=L;
		long min =L;
		while(i<=R ){
			if(i%MOD > min){
				min=i;
				if(min%MOD == 0){
					break;
				}
			}
			i++;
		}
		long ans = 0;
		if(min==L){
			ans = Long.remainderUnsigned(min*(min+1), MOD);
		}else if(min == R){
			ans = Long.remainderUnsigned(min*(min-1), MOD);
		}else{
			long l = Long.remainderUnsigned(min*(min-1),MOD);
			long r = Long.remainderUnsigned(min*(min+1),MOD);
			if(l < r ){
				ans = l;
			}else{
				ans = r;
			}
		}

		System.out.println(ans);

	}


}
