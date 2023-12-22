import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();

		String keyence = "keyence";
		char[] c = s.toCharArray();
		char[] k = keyence.toCharArray();
		int hit = 0;
		String ans = "";
		for(int i=0;i<s.length();i++){
			if(hit>keyence.length()){
				break;
			}
			if(c[i]==k[hit]){
				ans+=c[i];
				hit++;
			}
		}
		if(keyence.equals(ans)){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
	}
}