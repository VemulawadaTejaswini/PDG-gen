import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	
		int n = sc.nextInt();
		String[] strs = new String[n];
		int res = 0;
		int startB = 0;
		int endA = 0;
		
		for(int i=0; i<n; i++) {
			strs[i] = sc.next();
			if(strs[i].startsWith("B")) {
				startB++;
			}
			if(strs[i].endsWith("A")) {
				endA++;
			}
		}
		int min = Math.min(startB, endA);
		for(int i=0; i<strs.length; i++) {
			String tmp = strs[i];
			int index = 0;
			while(tmp.indexOf("AB") != -1) {
				index = tmp.indexOf("AB") + 2;
				tmp = tmp.substring(index);
		        res++;
			}
		}
		System.out.println(min+res);
	}
}
