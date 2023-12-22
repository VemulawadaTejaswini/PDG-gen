import java.util.Scanner;

class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int N;
			int re = 9999999;
			int S1 = 0;
			int S2 = 0;
			int[] W;

			N = sc.nextInt();
			W = new int[N];
			for(int i = 0;i < N; i++) {
					W[i] = sc.nextInt();
					S2 += W[i];
			}

			for (int i = 0; i < N; i++ ){
					S1 += W[i];
					S2 -= W[i];
					if(S1 > S2){
							if(re > S1 - S2){
									re = S1 - S2;
							}
					}else {
							if(re > S2 - S1){
									re = S2 - S1;
							}
					}
			}
			System.out.println(re);
    }
}
