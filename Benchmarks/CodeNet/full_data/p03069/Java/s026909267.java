import java.util.*;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();

		String[] s = S.split("");

		int[] bCnt = new int[N];

		if(s[0].equals("#")){
			bCnt[0] = 1;
		} else {
			bCnt[0] = 0;
		}

		for(int i=1; i<N; i++){
			if(s[i].equals("#")){
				bCnt[i] = bCnt[i-1]+1;
			} else{
				bCnt[i] = bCnt[i-1];
			}
		}

		int[] wCnt = new int[N];
		wCnt[N-1]=0;
		if(s[N-2].equals(".")){
			wCnt[N-2]=1;
		}else{
			wCnt[N-2]=0;
		}

		for(int i=N-3; i>-1; i--){
			if(s[i].equals(".")){
				wCnt[i]= wCnt[i+1]+1;
			}else{
				wCnt[i]= wCnt[i+1];
			}
		}

		int min = 999999999;

		for(int i=0; i<N; i++){
			if(min>bCnt[i]+wCnt[i]){
				min = bCnt[i]+wCnt[i];
			}
		}

		System.out.println(min);


	}


}
