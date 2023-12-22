import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] a = new int[n];
		int[] cnt = new int[100000];
		int[] around = new int[100000];

		for(int i=0; i<100000; i++){
			cnt[i] = 0;
		}


		for(int i=0; i<n; i++){
			a[i] = sc.nextInt();
			cnt[a[i]]++;
			around[a[i]]++;
			if(a[i]!=0){
				around[a[i]-1]++;
			}
			if(a[i]!=99999){
				around[a[i]+1]++;
			}
		}

		int maxIdx=0;
		int max=around[0];
		for(int i=1; i<n; i++){
			if(around[i]>max){
				maxIdx=i;
				max=around[i];
			}
		}
		if(maxIdx-2>=0){
			if(around[maxIdx]==around[maxIdx-2]){
				max--;
			}
		}
		if(maxIdx+2<=99999){
			if(around[maxIdx]==around[maxIdx+2]){
				max++;
			}
		}

		System.out.println(max);
	}
}
