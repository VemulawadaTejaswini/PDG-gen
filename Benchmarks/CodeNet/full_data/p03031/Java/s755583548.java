import java.time.Instant;
import java.util.*;
import java.util.function.ToLongFunction;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();

		int[][] ks = new int[M][N+1];
		int[] p = new int[M];

		for(int i=0; i<M; i++){
			ks[i][0] = sc.nextInt();
			for(int j=1; j<ks[i][0]+1; j++){
				ks[i][j]= sc.nextInt();
			}
		}

		for(int i=0; i<M; i++){
			p[i] = sc.nextInt();
		}

		String[] of = new String[(int)Math.pow(2, N)];
		for(int i=0; i<Math.pow(2, N); i++){
			int bi =Integer.parseInt(Integer.toBinaryString(i));
			of[i] = String.format("%0"+N+"d", bi);
		}

		int ans=0;
		outer: for(int i=0; i<Math.pow(2, N); i++){
			ans++;
			String[] eof = of[i].split("");
			int count=0;
			for(int k=0; k<M; k++){

				for(int j=1; j<ks[k][0]+1; j++){
					if(eof[ks[k][j]-1].equals("1") ){
						count++;
					}
				}

				if(count%2 != p[k] || count ==0){
					ans--;
					continue outer;
				}
			}
		}

		System.out.println(ans);

	}

}


