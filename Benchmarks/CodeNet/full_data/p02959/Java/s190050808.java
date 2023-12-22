import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] numMonsters = new int[N+1];
		int[] capasityHero = new int[N];		
		for(int i=0;i<N+1;i++) {
			numMonsters[i] = sc.nextInt();
		}		
		for(int i=0;i<N; i++) {
			capasityHero[i] = sc.nextInt();
		}
		
		long sum = 0;
		long extra = 0;
		for(int i=0;i<N;i++) {
			long capasity = capasityHero[i] + extra;
			if(capasity > numMonsters[i]) {
				sum += numMonsters[i];
				extra = capasity-numMonsters[i];
			}else {
				sum += capasity;
			}
			
			if(i==N-1) {
				if(extra > numMonsters[i+1]) {
					sum += numMonsters[i+1];
				}else {
					sum += extra;
				}
			}
		}
		
		System.out.println(sum);
		
		sc.close();	
	}
 
}