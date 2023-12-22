import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		List<String> binList = new ArrayList<>();
		
		for (int i = 0; i < n+1; i++) {
			String x = sc.next();
			for (int j = 0; j < x.length(); j++) {
				if (x.charAt(j) == '0') continue;
				if (i == 0) {
					binList.add(" ");
					continue;
				}
				String bin = Integer.toBinaryString(j);
				while (bin.length() < i) {
					bin = "0" + bin;
				}
				binList.add(bin);
			}
		}
		
		String answer = " ";
		
		for (int i = 0; i < binList.size(); i++) {
			if (k != 1 && binList.get(i).length() == n) continue;
			int count = 0;
			String str = binList.get(i);
			for (int j = 0; j < binList.size(); j++) {
				if (binList.get(j).indexOf(str) != -1) count++;
			}
			
			if (count >= k && str.length() > answer.length()) {
				answer = str;
			}
		}
		
		System.out.println(answer);	

	}	
}
