import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		String buf = " ";
		String buf2 = " ";
		int ans = 0;
		int a,b,c;
		int count = 10 + '0';
		boolean[] list = new boolean[1000];
		Arrays.fill(list,false);
		for(char i = '0';i < count;i++){
			if(S.indexOf(i) != -1){
				buf = S.substring(S.indexOf(i) + 1);
			}else{
				continue;
			}
			for(char j = '0';j < count;j++){
				if(buf.indexOf(j) != -1){
					buf2 = buf.substring(buf.indexOf(j) + 1);
				}else{
					continue;
				}
				for(char k = '0';k < count;k++){
					if(buf2.indexOf(k) != -1){
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