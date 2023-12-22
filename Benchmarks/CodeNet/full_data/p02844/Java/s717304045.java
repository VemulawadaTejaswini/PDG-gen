import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		String buf = " ";
		int ans = 0;
		int a,b,c;
		boolean[] list = new boolean[1000];
		Arrays.fill(list,false);
		for(char i = '0';i < '10';i++){
			if(S.indexOf(i) != -1){
				buf = S.substring(S.indexOf(i));
			}else{
				break;
			}
			for(char j = '0';j < '10';j++){
				if(buf.indexOf(j) != -1){
					buf = buf.substring(buf.indexOf(j));
				}else{
					break;
				}
				for(char k = '0';k < '10';k++){
					if(buf.indexOf(k) != -1){
						a = i - '0';
						b = j - '0';
						c = k - '0';
						list[a * 100 + b * 10 + c] = true;
					}
				}
			}
		}
		for(int i = 0;i < 1000;i++){
			if(list[i]){
				ans++;
			}
		}
		System.out.println(ans);
	}
}