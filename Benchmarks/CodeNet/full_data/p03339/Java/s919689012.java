import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		String S = scan.next();
		scan.close();
		String []a = S.split("");
		int cntrW[] = new int[N];
		int cntrE[] = new int[N];
		int cntlW[] = new int[N];
		int cntlE[] = new int[N];
		int cntW = 0;
		int cntE = 0;
		for(int i = 0; i < N; i++) {
			if(a[i].equals("W")) {
				cntW ++;
			}
		}
		cntE = N - cntW;
		if(a[0].equals("W")) {
			cntrW[0] = cntW - 1;
			cntrE[0] = cntE;
		}else {
			cntrW[0] = cntW;
			cntrW[0] = cntE - 1;
		}

		for(int i = 1; i < N; i++) {
			if(a[i].equals("W")) {
				cntrW[i] = cntrW[i - 1] - 1;
				cntrE[i] = cntrE[i - 1];
			}else {
				cntrW[i] = cntrW[i - 1];
				cntrE[i] = cntrE[i - 1] - 1;
			}
		}

		if(a[N - 1].equals("W")){
			cntlW[N - 1] = cntW - 1;
			cntlE[N - 1] = cntE;
		}else {
			cntlW[N - 1] = cntW;
			cntlE[N - 1] = cntE - 1;
		}
		for(int i = N - 2; i >= 0; i++) {
			if(a[i].equals("W")) {
				cntlW[i] = cntlW[i + 1] - 1;
				cntlE[i] = cntlE[i + 1];
			}else {
				cntrW[i] = cntlW[i + 1];
				cntlE[i] = cntlE[i + 1] - 1;
			}
		}
		//int []k = new int[N];
		int min = 1000000000;
		int k = 0;
		for(int i = 0; i < N; i++) {
			if(a[i].equals("W")) {
				k = cntrW[i] + cntlE[i];
			}else {
				k = cntrE[i] + cntlW[i];
			}
			if(k < min) {
				min = k;
			}
		}
		System.out.println(k);

	}
}