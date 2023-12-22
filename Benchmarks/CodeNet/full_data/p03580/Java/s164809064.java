import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> temp = new ArrayList<>();
		int N = sc.nextInt();
		int[] s = new int[N];
		String retu = sc.next();
		char[] smoji = retu.toCharArray();
		int x = 0;
		for(char c:smoji){
			s[x]=Character.getNumericValue(c);
			x++;
		}
		int ans=0;
		int cnt=0;
		for(int a:s){
			if(a==1){
				cnt++;
			}
		}
		for(int k=0;k<cnt;k++){
			for(int j =0;j<N-2;j++){
				if(s[j]==1&&s[j+1]==0&&s[j+2]==1){
					s[j] = 0;
					s[j+1] = 1;
					s[j+2] = 0;
					ans++;
				}
				if(s[N-1-j]==1&&s[N-2-j]==0&&s[N-3-j]==1){
					s[N-1-j] = 0;
					s[N-2-j] = 1;
					s[N-3-j] = 0;
					ans++;
				}
			}
		}
		System.out.println(ans);

	}
}