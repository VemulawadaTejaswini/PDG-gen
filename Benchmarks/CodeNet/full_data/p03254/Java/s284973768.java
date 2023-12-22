import java.util.*;

class Main{
	
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();

		int ar[] = new int[N];

		for(int n=0;n<N;n++){
			ar[n] = sc.nextInt();
		}

		Arrays.sort(ar);

		int cnt = 0;

		for(int n=0;n<N;n++){

			if(n==N-1){
				if(X==ar[n]) cnt++;
				break;
			}
			if(X>=ar[n]){
				cnt++;
				X -= ar[n];
			}else break;
		}

		System.out.println(cnt);

	}
}