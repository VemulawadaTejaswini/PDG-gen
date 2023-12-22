import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
         
     try (Scanner scan = new Scanner(System.in)) {
			int inputN = scan.nextInt();
			int inputQ = scan.nextInt();
			String inputStr = scan.next();
			List<Integer> ans = new ArrayList<>();
			for (int i = 0; i < inputQ; i++) {
				int inputI = scan.nextInt()-1;
				int inputR = scan.nextInt();
				int cnt = 0;
				String t=inputStr.substring(inputI,inputR);
				for(int n = 0; n < t.length()-1; n++) {
					if("AC".equals(t.substring(n, n+2))) {
						cnt++;
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