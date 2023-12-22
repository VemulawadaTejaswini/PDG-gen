import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();

		String keyence = "keyence";

		// 全部一致
		if(keyence.equals(s)){
			System.out.println("YES");
			return;
		}
		int f = s.indexOf(keyence);
		// 先頭一致
		if(f==0){
			System.out.println("YES");
			return;
		}else if(f>0){
			// 後方一致
			if(f+keyence.length()==s.length()){
				System.out.println("YES");
				return;
			}else{
				System.out.println("NO");
				return;
			}
		}
		// 前後一致
		char[] c = s.toCharArray();
		char[] k = keyence.toCharArray();
		int hit = 0;
		int cnt = 0;
		boolean b = false;
		for(int i=0;i<s.length();i++){
			if(c[i]==k[hit]){
				hit++;
				b = true;
			}else{
				if(b){
					if(cnt>0){
						System.out.println("NO");
						return;
					}
					cnt++;
					b = false;
				} 
			}
		}
		System.out.println(hit==7?"YES":"NO");
	}
}