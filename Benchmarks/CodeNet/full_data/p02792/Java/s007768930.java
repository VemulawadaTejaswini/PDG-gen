import java.util.ArrayList;
import java.util.Scanner;

 
public class Main {
 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ArrayList<Integer> AList = new ArrayList<>();
		ArrayList<Integer> BList = new ArrayList<>();
		int ans = 0;
		
		for(int i = 1; i <= N; i++) {
			AList.add(i);
			BList.add(i);
		}
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				boolean firstCondition = true;
				boolean secondCondition = true;
				
				//A の末尾の桁が	 B  の先頭の桁に等しく、		 
				String A = AList.get(i).toString();
				Character Alast = A.charAt(A.length() - 1);
				Character Bfirst = BList.get(j).toString().charAt(0);
				if(!Alast.equals(Bfirst)) {
					firstCondition = false;
					continue;
				}
				//A の先頭の桁が	 B  の末尾の桁に等しい
				Character Afirst = AList.get(i).toString().charAt(0);
				String B = BList.get(j).toString();
				Character Blast = B.charAt(B.length() - 1);
				if(!Afirst.equals(Blast)) {
					secondCondition = false;
					continue;
				}
				
				if(firstCondition && secondCondition) {
					ans++;
				}
			}
		}
		
		System.out.println(ans);
		sc.close();
	}
}