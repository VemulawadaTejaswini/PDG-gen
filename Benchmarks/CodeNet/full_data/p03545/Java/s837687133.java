import java.io.*;

public class Main {

	final static long MOD = 1000000007;
	public static int[] X = new int[4];
	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String S = in.readLine();

		X[0] = Integer.parseInt(String.valueOf(S.charAt(0)));
		X[1] = Integer.parseInt(String.valueOf(S.charAt(1)));
		X[2] = Integer.parseInt(String.valueOf(S.charAt(2)));
		X[3] = Integer.parseInt(String.valueOf(S.charAt(3)));


		System.out.println(op(0,new String[3],X[0]));
	}

	public static String op(int idx,String[] op,int sum){
		if(idx==3){
			if(sum==7){
				return X[0]+op[0]+X[1]+op[1]+X[2]+op[2]+X[3]+"=7";
			}else{
				return null;
			}
		}
		op[idx]="+";
		String ans = op(idx+1,op,sum+X[idx+1]);
		if(ans!=null){
			return ans;
		}
		op[idx]="-";
		return op(idx+1,op,sum-X[idx+1]);

	}
}
