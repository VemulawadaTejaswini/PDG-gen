import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		String[] spl = S.split(" ");
		int N = Integer.parseInt(spl[0]);
		int M = Integer.parseInt(spl[1]);
		String Si = "";
		int[] L = new int[M];
		int[] R = new int[M];
		for(int i = 0;i < M;i++){
			 Si = sc.nextLine();
			String[] Sispl = Si.split(" ");
			L[i] = Integer.parseInt(Sispl[0]);
			R[i] =Integer.parseInt(Sispl[1]);
			Si = "";
		}
		sc.close();

		boolean b = true;
		int totalCnt = 0;
		for(int j = 1;j <= N;j++){
			for(int k = 0;k < M;k++){
				if(j < L[k] || j > R[k]){
					b= false;
					break;
				}
			}
			if(b){
				totalCnt++;
			}
			b =true;
		}
		System.out.println(totalCnt);
	}
}