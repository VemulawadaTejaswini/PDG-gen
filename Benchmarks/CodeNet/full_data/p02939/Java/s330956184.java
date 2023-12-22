import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String inp = sc.next();
		char tmp = 0;

		int leg = inp.length();
		int cnt = 0;
		int n = 0;
		Boolean past = false;
		int ans = 0;

		for(int i = 0 ; i < leg ; i++){
			if(i == 0){
				tmp = inp.charAt(0);
				cnt++;
			}else{
				if(tmp == inp.charAt(i)){
					cnt++;
					if(cnt == 3){
						n++;
						cnt = 0;
					}
				}else{
					ans += 2*n;
					if(cnt != 0){
						ans += 1;
					}
					if(n == 0 && cnt == 2 && past){
						ans += 1;
						past = false;
					}else{
						if(cnt == 2 && n == 0){
							past = true;
						}else{
							past = false;
						}
					}
					tmp = inp.charAt(i);
					cnt = 1;
					n = 0;
				}
			}
		}
		ans += 2*n;
		if(cnt != 0){
			ans += 1;
		}
		if(n == 0 && cnt == 2 && past){
			ans += 1;
			past = false;
		}

		System.out.println(ans);
	}

}