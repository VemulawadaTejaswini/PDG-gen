public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();	
		int b = 0;		
		int f = 0;		
		int r = 0;		
		int v = 0;		
		int[][][] buildings = new int[4][3][10];
		for(int i=0;i<4;i++) {
			for(int j=0;j<3;j++) {
				for(int k=0;k<10;k++) {
					buildings[i][j][k]=0;
				}
			}
		}
		for(int i=0;i<n;i++) {
			b = scanner.nextInt();
			f = scanner.nextInt();
			r = scanner.nextInt();
			v = scanner.nextInt();
			buildings[b-1][f-1][r-1] += v;
		}
		for(int i=0;i<4;i++) {
			if (i!=0) {
				System.out.println("####################");
			}
			for(int j=0;j<3;j++) {
				for(int k=0;k<10;k++) {
					System.out.print(" " + buildings[i][j][k]);
				}
				System.out.println();
			}
		}
		scanner.close();
	}
}
