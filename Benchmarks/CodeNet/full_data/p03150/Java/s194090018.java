import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();

		char[] c = s.toCharArray();
		String ans = "";
		for(int i=0;i<s.length();i++){
			if(c[i]=='k'||c[i]=='e'||c[i]=='y'||c[i]=='n'||c[i]=='c'){
				ans+=c[i];
			}
		}
		if("keyence".equals(ans)){
			System.out.println("YES");
			return;
		}
	}
}