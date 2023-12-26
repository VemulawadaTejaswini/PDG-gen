public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arrayH = new int[N];
		for(int i=0;i<N;i++) {
			arrayH[i] = sc.nextInt();
		}
		sc.close();
		int ans = 0;
		int count = 0;
		for(int i = 0;i<N-1;i++) {
			if(arrayH[i]>=arrayH[i+1]) {
				count++;
			}else {
				ans = Math.max(count,ans);
				count = 0;
			}
		}
		ans = Math.max(count,ans);
		System.out.println(ans);
	}
}
