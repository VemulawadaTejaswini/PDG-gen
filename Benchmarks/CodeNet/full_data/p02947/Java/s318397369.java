import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] byte_total = new int[n];
		int count = 0;
		int count_abc;
		String abc="abcdefghijkmnlopqrstuvwxyz";
		char []c_abc=abc.toCharArray();
		for (int i = 0; i < n; i++) {
			count_abc=0;
			String str = scan.next();
			char []c = str.toCharArray();
			for (int j = 0; j < c.length; j++) {
				for(int k=0;k<c_abc.length;k++){
					if(c_abc[k]==c[j]){
						count_abc+=k;
					}
				}
			}
			byte_total[i]+=count_abc;
		}
		for (int i = 0; i < n - 1; i++)
			for (int j = i + 1; j < n; j++) {
				if(byte_total[i]==byte_total[j]){
					count++;
				}
			}
		System.out.println(count);
	}
}