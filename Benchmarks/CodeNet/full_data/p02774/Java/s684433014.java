import java.util.*;
import java.util.Collections;
/**
 * Main
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		int K = sc.nextInt();
		int X;
		int Y;
		if(N*(N-1)/4>=K){
			Boolean modeSmall = true;
			Y = K;
		} else{
			Boolean modeSmall = false;
			Y = N*(N-1)/2-K+1;
		}
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Integer> List = new ArrayList<>();
		for(int i = 0;i<N;i++){
			X = sc.nextInt();
			list.add(X);
			for(int j = 0; j < list.size(); j++){
				List.add(X*list.get(j));
			}
		}
		Collections.sort(List);
		System.out.println(List.get(K-1));
		sc.close();
	}
};
