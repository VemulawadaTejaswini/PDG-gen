public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
			int N  = sc.nextInt();
			int M= sc.nextInt();
			int homework =0;
			for(int i=0;i<M;i++) {
				homework+= sc.nextInt();
			}
			int ans = N - homework;
			if(ans >=0) {
				System.out.println(ans);
			}else {
				System.out.println(-1);
			}
	}
}
