import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int T = sc.nextInt();
		int[] t = new int[N];
		for(int i=0; i<N; i++){
			t[i] = sc.nextInt();
		}
		
		long sum = 0;
		for(int i=1; i<N; i++){
			if(t[i]-t[i-1]<T){
				sum += t[i] - t[i-1];
			}else{
				sum += T;
			}
		}
		sum += T;
		
		System.out.print(sum);
		
	}

}
