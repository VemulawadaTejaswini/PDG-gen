import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			String S = scan.next();
			int Q = scan.nextInt();
			int[] T = new int [Q];
			int[] F = new int [Q];
			String[] C = new String[Q];
			StringBuffer sb = new StringBuffer();
			
			for(int i = 0;i<Q;i++) {
				T[i] = scan.nextInt();
				if(T[i]==2) {
					F[i] = scan.nextInt();
					C[i] = scan.next();
				}
			}
			
			sb.append(S);
			String sentou = "";
			String kouhou = "";
			
			boolean gyaku = false;
			
			for(int i = 0;i<Q;i++) {
				if(T[i]==1) {
					gyaku = !gyaku;
					//sb.reverse();
				}else if(T[i]==2) {
					if(F[i]==1) {
						if(gyaku) kouhou = kouhou+C[i];//sb.append(C[i]);//逆
						else sentou = C[i]+sentou;//sb.insert(0, C[i]);//逆ではない
					}else if(F[i]==2) {
						if(gyaku)sentou = C[i]+sentou; //sb.insert(0, C[i]);
						else kouhou = kouhou+C[i];//sb.append(C[i]);
					}
				}
			}
			
			sb.insert(0, sentou);
			sb.append(kouhou);
			
			if(gyaku)sb.reverse();
			
			System.out.println(sb.toString());
			
			
			
			
			
			
		}	
	}
	
	
}
