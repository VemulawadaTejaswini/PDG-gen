import java.util.*;

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int N = sc.nextInt();
		int K = sc.nextInt();

		int p[] = new int[N];
		for(int i=0; i<N; i++){
			p[i] = sc.nextInt();
		}
		double karray[] = new double[N];
		double max = 0;
		
		for(int i=0; i<N; i++){
			karray[i] = kitaichi(p[i]);
		}

		for(int i=0; i<(N-K+1); i++){
			double sum = 0;
			for(int j=0; j<K; j++){
				sum += karray[i+j];
			}

			if(sum > max) max = sum;
		}
		System.out.println(max);

	}

	public static double kitaichi(int n){
		double k = 0;
		for(double i=1; i<=n;i++){
			k += i/n;
		}
		return k;
	}
}


