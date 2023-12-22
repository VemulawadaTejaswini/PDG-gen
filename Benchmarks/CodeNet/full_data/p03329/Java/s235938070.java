import java.util.*;
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int ans = N;
		for(int i=0;i<=N;++i){
			int six = i;
			int nine = N-six;
			int score = 0;
			while(six!=0){
				score += six%6;
				six /= 6;
			}
			while(nine!=0){
				score += nine%9;
				nine /= 9;
			}
			if(score<ans) ans = score;
		}
		
		System.out.println(ans);
		return;
	}
}