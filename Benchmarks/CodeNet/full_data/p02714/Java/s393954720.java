import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		String s = sc.next();
		
		// 計算
		long result = 0;
		int[] sumR = new int[n+1];
		int[] sumG = new int[n+1];
		int[] sumB = new int[n+1];
		for(int i = 0; i < n; i++){
		    char a = s.charAt(i);
		    if(a == 'R'){
		        sumR[i+1] += sumR[i] + 1;
		        sumG[i+1] += sumG[i];
		        sumB[i+1] += sumB[i];
		    }
		    if(a == 'G'){
		        sumR[i+1] += sumR[i];
		        sumG[i+1] += sumG[i] + 1;
		        sumB[i+1] += sumB[i];
		    }
		    if(a == 'B'){
		        sumR[i+1] += sumR[i];
		        sumG[i+1] += sumG[i];
		        sumB[i+1] += sumB[i] + 1;
		    }
		}
		for(int i = 0; i < n; i++){
		    for(int j = i+1; j < n; j++){
		        char a = s.charAt(i);
		        char b = s.charAt(j);
		        if(a == b) continue;
		        if((a == 'R' && b == 'G') || (a == 'G' && b == 'R')){
		            result += sumB[n]-sumB[j+1];
		        }
		        if((a == 'G' && b == 'B') || (a == 'B' && b == 'G')){
		            result += sumR[n]-sumR[j+1];
		        }
		        if((a == 'B' && b == 'R') || (a == 'R' && b == 'B')){
		            result += sumG[n]-sumG[j+1];
		        }
		        if(j-i+j < n && s.charAt(j-i+j) != a && s.charAt(j-i+j) != b) result--;
		    }
		}
		
		// 出力
		System.out.println(result);
	}
	
}

