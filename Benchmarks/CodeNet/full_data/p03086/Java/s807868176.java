import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		char S1[] = S.toCharArray();
		int max_count = 0;
		int count = 0;
		for(int i = 0; i<S.length(); i++) {
			if(S1[i] == 'A' || S1[i] == 'C' ||S1[i] == 'G' ||S1[i] == 'T') {
				count++;
			}
			else {
				count = 0;
			}
			if(count > max_count) {
				max_count = count;
				
			}
			
		}
		System.out.println(max_count);
		
		
		
    }

}