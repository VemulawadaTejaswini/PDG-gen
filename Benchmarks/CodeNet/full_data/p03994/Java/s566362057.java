import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		String str = sc.nextLine();
		int k = sc.nextInt();
		char[] c = str.toCharArray();
		for (int i = 0; i < c.length; i++) {
			if (c[i] == 'a')
				continue;
			int tmp='z'+1-c[i];
			if(tmp<=k){
				k-=tmp;
				c[i]='a';
			}
		}
		if(k!=0){
			k%=26;

			int end=str.length()-1;
			c[end]+=k;
			if(c[end]>'z') c[end]-=26;
		}

		System.out.println(String.valueOf(c));
	}
}
