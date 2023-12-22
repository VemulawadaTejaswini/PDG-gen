import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int[] x = new int[N];
		int[] y = new int[M];
		
		for (int i = 0; i < N; i++) {
			x[i] = sc.nextInt();;
		}
		for (int i = 0; i < M; i++) {
			y[i] = sc.nextInt();;
		}
		boolean flag1 = false;
		boolean flag2 = false;
		for (int i = X+1; i <= Y; i++) {
			for (int j = 0; j < N; j++) {
				if (x[j]<i) {
					flag1 = true;
				} else {
					flag1 = false;
					break;
				}
			}
			if (!flag1){
				continue;
			}
			for (int j = 0; j < M; j++) {
				if (y[j]>=i) {
					flag2 = true;
				} else {
					flag2 = false;
					break;
				}
			}
			if (flag1&&flag2) {
				break;
			}
		}
		if(flag1&&flag2){
			System.out.println("No War");						
		} else {
			System.out.println("War");						
		}
		
		
		// 入力
		/*
		String S = sc.next();                
		String T = sc.next();                
		
		for (int i = 0; i < S.length(); i++) {
			if (!S.substring(i,i+1).equals(T.substring(i,i+1))) {
				if (S.indexOf(T.substring(i,i+1)) == -1) {
					S = S.replace(S.substring(i,i+1), T.substring(i,i+1));
				} else {
					String s = S.substring(0, S.length());
					StringBuilder sb = new StringBuilder("");
					for (int j = 0; j < s.length(); j++) {
						if (s.substring(j, j+1).equals(S.substring(i, i+1))) {
							sb.append(T.substring(i, i+1));
						} else if (s.substring(j, j+1).equals(T.substring(i, i+1))) {
							sb.append(S.substring(i, i+1));							
						} else {
							sb.append(s.substring(j, j+1)); 
						}
					}
					S = sb.toString();
				}
			}
		}
		if(S.equals(T)){
			System.out.println("Yes");			
		} else {
			System.out.println("No");			
		}
	*/
	}	
}
