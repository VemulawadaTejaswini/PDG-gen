import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();	
		
		int money = sc.nextInt();
		int min = 0;
		
		for(int i=0;i<N;i++){
			int t = sc.nextInt();
			if(min==0||t<min)
				min = t;
			money-=t;
		}
		
		int ans = N;
		ans += money/min;
		
		System.out.println(ans);
		

	}

}
