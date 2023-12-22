import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String[] str = new String[N];

		for(int i=0;i<N;i++){
			str[i]=sc.next();
		}
		
		boolean Flg = true;
		
		//重複チェック
		String hikaku ="";
		int cnt = 0;
		for(int i=0;i<N;i++) {
			hikaku = str[i];
			for(int j=0;j<N;j++) {
				if(str[j].equals(hikaku)) {
					cnt++;
				}
			}
		}
		//重複なし
		if(cnt==N) {
			String matubi = "";
			for(int i=0;i<N-1;i++) {
				matubi = String.valueOf(str[i].charAt(str[i].length()-1));
				if(!matubi.equals(String.valueOf(str[i+1].charAt(0)))) {
					Flg= false;
				}
			}
		}else {
			Flg=false;
		}
		
		if(Flg) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
		sc.close();
	}
}