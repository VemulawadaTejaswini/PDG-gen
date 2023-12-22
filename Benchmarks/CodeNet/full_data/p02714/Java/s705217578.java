import java.util.Scanner;

	public class Main {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			String str = sc.next();
			char[] s = str.toCharArray();
			long ret = 0;
			
			for(int i=0;i<n;i++) {
				for(int j=i+1;j<n;j++) {
					if(s[i]==s[j]) {
						continue;
					}
										
					for(int k=j+1;k<n;k++) {
						if((k-j)==(j-i)) {
							continue;
						}
						if(s[j]!=s[k]&&s[i]!=s[k]) {
							ret++;
						}
					}
				}
			}
			
			System.out.println(ret);
		}	
	}