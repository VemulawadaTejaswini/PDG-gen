import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {
		
			String s = sc.next();
			int q = sc.nextInt();
			
			List<String> sList = new ArrayList<>();
			boolean isRev = false;
			sList.add(s);
			
			for(int i = 0 ; i < q ; i++ ) {
				int op = sc.nextInt();
				
				if ( op == 1 ) {
					isRev = !isRev;
				}
				else {
					int f = sc.nextInt();
					String c = sc.next();
					
					if ( isRev) {
						if ( f == 1 ) {
							//add rev head
							sList.add(c);
						}
						else {
							sList.add(0,c);
						}
					}
					else {
						if ( f == 1 ) {
							//add head
							sList.add(0, c);
						}
						else {
							sList.add(c);
						}
					}
					
				}
			}
			
			if ( isRev ) {
				Collections.reverse(sList);
			}
			
			StringBuilder sb = new StringBuilder();					
			
			for(String ss : sList) {
				sb.append(ss);
			}
			
			System.out.println(sb.toString());
			
		}
	}
}