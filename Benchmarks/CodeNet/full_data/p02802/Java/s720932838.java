import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int P[] = new int[1000001];
		String S[] = new String[1000001];

		for(int i=0; i<M; i++) {
			P[i] = sc.nextInt();
			S[i] = sc.next();
		}

		//正解数
		int cntAC = 0;
		//ペナルティ数
		int cntWA = 0;
				
		for(int j=0; j<M; j++) {
			if(S[j].equals("WA") && P[j] != 1000002) {
				cntWA++;
			}else {
				for(int i=j; i<M; i++) {
					if(P[i] == 1000002) {
						break;
					}else if(S[i].equals("AC")) {
						cntAC++;
						for(int k=i+1; k<M; k++) {
							if(P[k] == P[i]) {
								P[k] = 1000002;
							}
						}
						break;
					}
				}
			}
		}

		System.out.println(cntAC + " " + cntWA);

	}
}