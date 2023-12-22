
import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int stick[] = new int[N];
		int cnt = 0;

		for(int i = 0; i < N; i++){
			stick[i] = sc.nextInt();
		}

		for(int i = 0; i < N; i++){
			for(int j = i+1; j < N; j++){
				for(int k = j+1; k < N; k++){
					if(stick[i] < stick[j] + stick[k] && stick[j]< stick[i] + stick[k] && stick[k] < stick[i] + stick[j]){
						cnt++;
					}
				}
			}
		}

		System.out.println(cnt);

		sc.close();
	}
}
