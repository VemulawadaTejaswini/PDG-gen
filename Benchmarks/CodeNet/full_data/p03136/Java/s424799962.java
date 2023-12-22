import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	static BufferedReader reader;
	
	public static void main(String[] args){
		reader = new BufferedReader(new InputStreamReader(System.in));
		String[] argA = readLine().split(" ");
		if(argA.length<1){return;}
		try{
			int N = Integer.parseInt(argA[0]);
			String[] argB = readLine().split(" ");
			if(argB.length!=N){return;}
			int[] L = new int[N];
			for(int i=0;i<N;i++){
				L[i]=Integer.parseInt(argB[i]);
			}
			for(int i=0;i<N;i++){
				int sum_other = 0;
				for(int j=0;j<N;j++){
					if(j==i){continue;}
					sum_other+=L[j];
				}
				if(L[i]>=sum_other){System.out.print("No");return;}
			}
			System.out.print("Yes");return;
		}catch(Exception e){
			e.printStackTrace();
		}
		return;
	}

	private static String readLine(){
		//BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try{
			return reader.readLine();
		}catch(Exception e){
			return e.getMessage();
		}
	}
}