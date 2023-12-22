class Main{
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[]a = new int[N+1];
		for(int i = 1; i <= N; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();
		boolean[] b = new boolean[N+1];
		
		int i = 1;
		b[1] = true;
		int count = 0;
		
		while(true) {
			if(b[i] == false) {
				count++;
				b[i] = true;
				if(a[i] == 2) {
					break;
				}
				i = a[i];
			}else {
				count = -1;
				break;
			}
		}
		System.out.println(count);
	}
}