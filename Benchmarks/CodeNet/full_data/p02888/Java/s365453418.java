import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String W = in.readLine();
		int N = Integer.parseInt(W);

		W = in.readLine();
		String[] Ws = W.split(" ");
		long[] L = new long[Ws.length];
		for(int i=0;i<Ws.length;i++){
			L[i] = Long.parseLong(Ws[i]);
		}
		Arrays.sort(L);

		long ans =0;
		for(int a=0;a<N;a++){
			if(a!=0&&L[a-1]==L[a]){
				continue;
			}
			for(int b=a+1;b<N;b++){
				if(b-1!=a&&L[b-1]==L[b]){
					continue;
				}
				for(int c=b+1;c<N;c++){
					if(c-1!=b&&L[c-1]==L[c]){
						continue;
					}
					if(L[a] < L[b]+L[c] && L[b] < L[c]+L[a] && L[c] <L[a]+L[b]){
						ans++;
//						System.out.println("a="+L[a]+",b="+L[b]+",c="+L[c]);
					}
				}
			}
		}

		System.out.println(ans);
	}
}
