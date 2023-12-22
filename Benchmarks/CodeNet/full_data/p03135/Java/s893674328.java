import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	
	static BufferedReader reader;
	
	public static void main(String[] args){
		reader = new BufferedReader(new InputStreamReader(System.in));
		String[] arg = readLine().split(" ");
		if(arg.length<2){return;}
		try{
			int N = Integer.parseInt(arg[0]);
			long K = Long.parseLong(arg[1]);

			String[] argB = readLine().split(" ");
			if(argB.length!=N){return;}
			long[] A = new long[N];
			long Amax = 0;
			for(int i=0;i<N;i++){
				A[i] = Long.parseLong(argB[i]);
				if(A[i]>Amax){Amax = A[i];}
			}
			long X = 0;
			if(K!=0){
				boolean[] XMask = new boolean[(int)Math.ceil(Math.log(K)/Math.log(2))+10];
				for(int i=XMask.length-1;i>=0;i--){
					if(X+Math.pow(2, i)>K){XMask[i]=false;continue;}
					int c1 = 0;
					int c0 = 0;
					long mask = (int)Math.pow(2, i);
					for(int j=0;j<N;j++){
						if((A[j]&mask)==0){c1++;}
						else{c0++;}
					}
					if(c1>c0){X+=Math.pow(2, i);}
					XMask[i] = (c1>c0);
				}
			}
			long ans = 0;
			for(int k=0;k<N;k++){
				ans += X^A[k];
			}

			System.out.println(ans);
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return;
	}
	

	private static String readLine(){
		try{
			return reader.readLine();
		}catch(Exception e){
			return e.getMessage();
		}
	}

}