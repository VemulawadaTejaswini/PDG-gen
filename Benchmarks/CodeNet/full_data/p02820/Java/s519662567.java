import java.util.*;
import java.io.*;
import java.math.BigInteger;
 
public class Main {
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int N = s.nextInt();
	int K = s.nextInt();
	int R = s.nextInt();
	int S = s.nextInt();
	int P = s.nextInt();
	String T = s.next();
	long score = 0;

	for(int i = 0; i < N; i++){
		if(T.charAt(i) == 'r'){
			score += P;
		}else if(T.charAt(i) == 's'){
			score += R;
		}else{
			score += S;
		}
	}
	
	for(int i = 0; i < K; i++){
		for(int j = 0; (j+1)*K+i < N; j++){
			if(T.charAt(j*K+i) == T.charAt((j+1)*K+i)){
				if(T.charAt(j*K+i) == 'r'){
					score -= P;
				}else if(T.charAt(j*K+i) == 's'){
					score -= R;
				}else{
					score -= S;
				}
				j++;
			}
		}
	}

	System.out.println(score);

    
  }
}