import java.util.*;
class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int o = 1; //初期タップ
		int ans = 0;
		while(o < b){
			--o;//ここで挿入に使うタップ-1をする
			o += a; //タップを増やす	
			++ans;
		}

		System.out.println(ans);
		
		}
	}