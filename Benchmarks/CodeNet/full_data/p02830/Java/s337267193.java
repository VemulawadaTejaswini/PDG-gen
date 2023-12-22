import java.util.*;

public class Main{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		String T = sc.next();
		String str ="";
		
		for(int i=0; i<N; i++){
			String strS = S.substring(i,i+1);
			String strT = T.substring(i,i+1);
			
			str += (strS + strT);
		
		}
			System.out.println(str);
	}
}