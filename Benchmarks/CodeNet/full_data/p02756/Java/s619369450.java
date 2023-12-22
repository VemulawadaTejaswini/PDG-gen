import java.util.Scanner;

 
public class Main {
 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		StringBuffer sb = new StringBuffer(S);
		int Q = sc.nextInt();
		
		for(int i = 0; i < Q; i++) {
			int query = sc.nextInt();
			if(query == 1) {
				sb = sb.reverse();
			}else if(query == 2) {
				int F = sc.nextInt();
				if(F == 1) {
					sb.insert(0, sc.next());
				}else if(F == 2) {
					sb.insert(sb.length(), sc.next());
				}
			}
		}
		
		System.out.print(sb);
		sc.close();
	}
	
}