import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine(),ans = "";
		int k = sc.nextInt();
		sc.close();

		char[] str = new char[s.length()];
		for(int i=0;i<s.length();i++){
			str[i] = s.charAt(i);
		}

		for(int i=0;i<s.length()&&k>=0;i++){
			int sub = (int)('z'-str[i])+1;
			if(str[i]=='a') continue;
			if(sub<=k){
				k -= sub;
				str[i] = 'a';
			}
		}
		if(k>0) str[s.length()-1] += k;
		if(str[s.length()-1]>'z') str[s.length()] = 'a';
		for(int i=0;i<s.length();i++) ans += str[i];
		System.out.println(ans);
	}

}