import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static int X[];
	static int N, M;
	
	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		
		N = scanner.nextInt();
		M = scanner.nextInt();
		
		X = new int[M];
		for(int i=0; i<M; i++) {
			X[i] = scanner.nextInt();
		}
		Arrays.sort(X);
		
	/*System.out.println("N:"+N + " M:"+M);
	for(int i=0; i<M; i++) {
		System.out.print(X[i]+" ");
	}System.out.print("\n");*/
		
			//仕切りを入れる//
		if(N-1 >= M)N = M; //重複を消去
	//System.out.println(Divide(X,M,0,0));
		System.out.print(Divide(0,0,N-1));
		
	return;
	}
	
	static int Divide(int StrPnt, int SumFmr, int DvsRst) {
		//System.out.println("* " + StrPnt + SumFmr +  DvsRst);
		int Min = 1000000;
		int NxtStrPnt, NxtSumFmr, NxtDvsRst, NxtMin;
		if(DvsRst == 0) {
		//System.out.println("A"+DvsRst);
			return(SumFmr+X[M-1]-X[StrPnt]);//開始地点から最後までの距離を返す
		}
		
		for(int i=1; i<M-StrPnt; i++) {//再帰的に仕切りをずらして最小距離を求める
			NxtStrPnt = StrPnt+i;
			NxtSumFmr = SumFmr + X[StrPnt+i-1] - X[StrPnt];
			NxtDvsRst = DvsRst-1;
			
			NxtMin = Divide(NxtStrPnt,NxtSumFmr,NxtDvsRst);
			if(Min > NxtMin)Min = NxtMin; 
		}
		
		return Min;
	}

}
