import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();

		String anser = null;

		int[] keta = new int[N];
		int[] suuchi = new int[K];

		//K回,回す
		for(int i =0;i < K; i++ ) {
			keta[i] = sc.nextInt();
			suuchi[i] = sc.nextInt();
		}

		for(int n = 0 ; n<N; n++) {

			if(keta[n] == 1) {
				if(anser == null) {
				 anser = Integer.toString(suuchi[n]);
				}
			}else if(keta[n] ==2) {
				if(anser != "") {
					anser = anser + Integer.toString(suuchi[n]);
				}
			}else if(keta[n] == 3) {
				if(anser.length() ==1) {
					anser = anser + "0"+ Integer.toString(suuchi[n]);
				}else {
					anser = anser + "0"+ Integer.toString(suuchi[n]);
				}
			}else if(keta[n] == 4) {
				if(anser != "") {
					anser = anser + Integer.toString(suuchi[n]);
				}
			}else if(keta[n] == 5) {
				if(anser != "") {
					anser = anser + Integer.toString(suuchi[n]);
				}
			}
		}
		if(anser.substring(0,0).equals(0) && anser.length() > 1 || anser ==null) {
			System.out.println("-1");
		}else {
			System.out.println(anser);
		}



	}
}
