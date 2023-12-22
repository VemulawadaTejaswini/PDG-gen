import java.util.Arrays;
import java.util.Scanner;


	public class Main {
		

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			char[] s = sc.next().toCharArray();
			
			int[] num = new int[3];
			
			for(int i=0;i<s.length;i++) {
				if(s[i]=='a') {
					num[0]++;
				}else if(s[i]=='b') {
					num[1]++;
				}else {
					num[2]++;
				}
			}
			
			Arrays.sort(num);
			
			num[1] -= num[0];
			num[2] -= num[0];
			
			if((num[1]==0&&num[2]==0) || (num[1]==0&&num[2]==1) || (num[1]==1&&num[2]==1)) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
			
		}
		
		
	}
