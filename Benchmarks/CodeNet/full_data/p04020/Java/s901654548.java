import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] card = new int[N];
		for(int i=0; i<N; i++){
			card[i] = sc.nextInt();
		}
		sc.close();
		
		int ans = 0;
		for(int i=0; i<N; i++){
			if(card[i]%2==0){
				ans += card[i]/2;
			}else{
				if(i+1<N && card[i+1]>0){
					ans += (card[i]+1)/2;
					card[i+1]--;
				}else{
					ans += (card[i]-1)/2;
				}
			}
		}
		
		System.out.println(ans);
		
	}
}
