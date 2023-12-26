public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] D = new int[N+1];
		Arrays.fill(D, 0);
		int i=0, j=0, tmp = 0;
		int ret = 0;
		for(i = 0;i < N; i++) {
			tmp = sc.nextInt();
			for(j=0; j<=i; j++) {
				if(D[j] == tmp) {
					break;
				} else if(D[j] == 0){
					D[j] = tmp;
					break;
				}
			}
		}
		sc.close();
		for(i = 0;i < N+1; i++) {
			if(D[i] == 0) {
				ret = i;
				break;
			}
		}
		System.out.println(ret);
	}
}
