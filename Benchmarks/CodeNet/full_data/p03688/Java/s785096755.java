import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int[] a = new int[N];
		a[0] = sc.nextInt();
		int min = a[0];
		int max = a[0];
		int cnt = 1;
		for(int i=1; i<N; i++){
			a[i] = sc.nextInt();
			if(a[i]<=min){
				min = a[i];
			}
			if(a[i]>=max){
				max = a[i];
			}
			if(a[i]==a[0]){
				cnt++;
			}
		}

		int maxCnt;
		int minCnt;
		if(max-min>1){
			System.out.println("NO");
		}else if(max-min==1){
			if(a[0]==max){
				maxCnt = cnt;
				minCnt = N - cnt;
			}else{
				maxCnt = N - cnt;
				minCnt = cnt;
			}
			if(max >= minCnt + 1 && max <= minCnt + maxCnt / 2){
				System.out.print("YES");
			}else{
				System.out.print("NO");
			}
		}else if(max==min){
			if(N==max+1 || N>=max*2){
				System.out.print("YES");
			}else{
				System.out.print("NO");
			}
		}

	}

}
