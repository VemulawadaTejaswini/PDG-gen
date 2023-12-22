import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String S = scan.next();
		StringBuffer str = new StringBuffer(S);
		int Q = scan.nextInt();
		int T = 0;
		int F = 0;
		String C = "";

		for (int i = 0; i < Q; i++){
			T = scan.nextInt();
			if (T == 1){
				str.reverse();
			}else if (T == 2){
				F = scan.nextInt();
				C = scan.next();
				if(F == 1){
					str.insert(0, C);
				}else if (F == 2){
					str.append(C);
				}
			}
		}
		System.out.println(str);
	}
}