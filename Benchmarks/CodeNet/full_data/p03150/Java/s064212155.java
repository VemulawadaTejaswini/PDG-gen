import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		sc.close();
		//keyence
		char[] ks = "keyence".toCharArray();
		int idx = 0; 
		for(int i=0;i<s.length;i++){
			if(s[i]==ks[idx]){
				idx++;
			}
		}
		System.out.println(idx==7?"YES":"NO");
	}
}