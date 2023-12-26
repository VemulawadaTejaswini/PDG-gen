public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int T = sc.nextInt();
		int cc = 1001;
		for(int i = 0; i < N; i++){
			int c = sc.nextInt();
			int t = sc.nextInt();
			if(t > T) continue;
			if(c < cc) cc = c;
		}
      	if(cc == 1001) System.out.println("TLE");
		else System.out.println(cc);
	}
}
