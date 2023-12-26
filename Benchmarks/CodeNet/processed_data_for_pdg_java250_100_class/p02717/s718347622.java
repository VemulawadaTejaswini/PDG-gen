public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] X = new int[3];
		for(int i = 0; i < 3;i++) {
			X[i]  = sc.nextInt();
		}
		int change = 0;
		change = X[0];
		X[0] = X[1];
		X[1] =change;
		int change1= 0;
		change1 = X[0];
		X[0] = X[2];
		X[2] = change1;
		for(int j = 0; j<3;j++) {
			System.out.print(X[j]+" ");
		}
		sc.close();
	}
}
