import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int[] n = new int[s.length()];
		for(int i=0;i<s.length();i++) {
			n[i] =0;
		}
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='R') {
				int j;
				for(j=i;j<s.length();j++) {
					if(s.charAt(j)=='L') {
						break;
					}
				}
				if(((j-i)%2) == 1) {
					n[j-1]++;
				}else {
					n[j]++;
				}
			}else {
				int j;
				for(j=i;j>=0;j--) {
					if(s.charAt(j)=='R') {
						break;
					}
				}
				if(((i-j)%2) == 1) {
					n[j+1]++;
				}else {
					n[j]++;
				}
			}
		}
		for(int i=0;i<n.length;i++) {
			System.out.print(n[i] + " ");
		}
		System.out.println();
		
	}
}