import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
         
     try (Scanner scan = new Scanner(System.in)) {
			int inputN = scan.nextInt();
			int inputQ = scan.nextInt();
			String inputStr = scan.next();

			List<Integer> memory = new ArrayList<>();
			
			for(int n=0; n < inputN-1; n++) {
				if('A'==(inputStr.charAt(n)) && 'C'==(inputStr.charAt(n+1))) {
					n++;
					memory.add(n);
				}
			}
			
			List<Integer> ans = new ArrayList<>();
			
			for (int i = 0; i < inputQ; i++) {
				int inputI = scan.nextInt();
				int inputR = scan.nextInt();
				int cnt = 0;
				for(Integer pos:memory) {
					if(pos >= inputI && pos+1 <= inputR) {
						cnt++;
					} else if(pos > inputR) {
						break;
					}
				}
				
				ans.add(cnt);
			}
			
			for (int i = 0; i < inputQ; i++) {
				System.out.println(ans.get(i));
			
			}
		}
    }
}