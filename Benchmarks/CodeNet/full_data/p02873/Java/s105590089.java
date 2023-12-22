import java.io.*;

public class Main {

	final static long MOD = 1000000007;
	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String S = in.readLine();
		int[] a = new int[S.length()+1];
		a[0]=0;
		int i=0;
		int cnt=0;

		long sum=0;
		while(i<S.length()){
			a[i]=0;
			while(i<S.length()&&S.charAt(i)=='<'){
				a[i+1]=a[i]+1;
				i++;
			}
			while(i<S.length()&&S.charAt(i)=='>'){
				a[i+1]=a[i]-1;
				cnt++;
				i++;
			}
			if(cnt>0){
				int dif=a[i]*-1;
				for(int k=i-cnt+1;k<=i;k++){
					a[k]+=dif;
				}
				a[i-cnt]=Math.max(a[i-cnt],a[i-cnt+1]+1);
			}
			cnt=0;

		}

		for(i=0;i<a.length;i++){
			sum+=a[i];
		}
		System.out.println(sum);
	}
}
