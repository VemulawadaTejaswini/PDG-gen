import java.util.Scanner;
import java.util.Arrays;

class Main{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] dataA = new int[n];
		int[] dataB = new int[n];
		int[] dataC = new int[n];

		for(int i = 0; i < n; i++){
			dataA[i] = scanner.nextInt();
		}
		String dusk = scanner.nextLine();

		for(int i = 0; i < n; i++){
			dataB[i] = scanner.nextInt();
		}
		dusk = scanner.nextLine();

		for(int i = 0; i < n; i++){
			dataC[i] = scanner.nextInt();
		}

		Arrays.sort(dataA);
		Arrays.sort(dataB);
		Arrays.sort(dataC);

		int min_b = 0;
		int min_c = 0;
		int answer = 0;

		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				if(dataB[j] > dataA[i]){
					for(int k = 0; k < n; k++){
						if(dataC[k] > dataB[j]){
							answer += n - k;
				// 			System.out.println(dataA[i] + " " + dataB[j] + " " + dataC[k]);
							break;
						}
					}
				}
			}
		}

		System.out.println(answer);
		
	}
}