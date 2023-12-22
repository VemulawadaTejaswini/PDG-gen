import java.util.Scanner;

public class Main {

	public static int seach_AC (String s,int start,int end) {
		int result = 0;
			for(int i = start; i < end; i++) {
				if(s.substring(i,i+2).equals("AC")) {
					i++;
					result++;
				}
			}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		String s = sc.next();
		int[] table = new int[s.length()];
		table[0] = 0;
		for(int i = 1; i < s.length(); i++) {
			table[i] = table[i-1] + seach_AC(s,i-1,i); 
		}
		
		System.out.println("");
		for(int i = 0; i < q; i++) {
			int r = sc.nextInt();
			int l = sc.nextInt();
			System.out.println(table[l-1] - table[r-1]);
		}
		sc.close();
	}
}
