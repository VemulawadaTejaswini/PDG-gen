public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int now = 0;
		int maxv = 0;
		int count = 0;
		for(int i = 0; i < N; i++) {
			int height = sc.nextInt();
			if(height > now) {
				maxv= Math.max(maxv, count);
				count = 0;
			}else {
				count++;
			}
			now = height;
		}
		System.out.println(Math.max(maxv, count));
	}
}
