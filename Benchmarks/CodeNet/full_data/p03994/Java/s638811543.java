import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine(),ans = "";
		int k = sc.nextInt();
		int len = s.length();
		sc.close();

		char[] str = new char[len];
		for(int i=0;i<len;i++){
			str[i] = s.charAt(i);
		}

		for(int i=0;i<len&&k>=0;i++){
			int sub = (int)('z'-str[i])+1;
			if(str[i]=='a') continue;
			if(sub<=k){
				k -= sub;
				str[i] = 'a';
			}
		}
		if(k>0) str[len-1] += k;
		if(str[len-1]>'z') str[len] = 'a';
		for(int i=0;i<len;i++) ans += str[i];
		System.out.println(ans);
	}

}