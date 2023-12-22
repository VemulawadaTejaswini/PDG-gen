import java.util.*;

class Main{
	public static void main(String[] $){
		//入力
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		sc.close();

		//処理
		String[] pat = {"SS", "SW", "WS", "WW"};
		String ret = "-1";
		for(String mat : pat){
			String ans = mat;
			for(int i = 1; i < n-1; i++){
				if(s.charAt(i) == 'o'){
					if(ans.charAt(i) == 'S'){
						if(ans.charAt(i-1) == 'S') ans += 'S';
						else ans += 'W';
					}else{
						if(ans.charAt(i-1) == 'S') ans += 'W';
						else ans += 'S';
					}
				}else{
					if(ans.charAt(i) == 'S'){
						if(ans.charAt(i-1) == 'S') ans += 'W';
						else ans += 'S';
					}else{
						if(ans.charAt(i-1) == 'S') ans += 'S';
						else ans += 'W';
					}
				}
			}
			boolean ok = true;
			if(s.charAt(0)== 'o' && ans.charAt(0) == 'S' || s.charAt(0) == 'x' && ans.charAt(0) == 'W'){
				if(ans.charAt(n-1) != ans.charAt(1)) ok = false;
			}else{
				if(ans.charAt(n-1) == ans.charAt(1)) ok = false;
			}
			if(s.charAt(n-1)== 'o' && ans.charAt(n-1) == 'S' || s.charAt(n-1) == 'x' && ans.charAt(n-1) == 'W'){
				if(ans.charAt(n-2) != ans.charAt(0)) ok = false;
			}else{
				if(ans.charAt(n-2) == ans.charAt(0)) ok = false;
			}
			if(ok){
				ret = ans;
				break;
			}
		}

		//出力
		System.out.println(ret);
	}
}
