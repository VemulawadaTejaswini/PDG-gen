import java.util.Scanner;

class Main {
	int[][] c;

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Main m = new Main(sc);
		m.solve();
		sc.close();
	}
	Main(Scanner sc){
		c = new int[3][3];
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				c[i][j] = sc.nextInt();
			}
		}
	}
	void solve(){
		int[] a = new int[3];
		int[] b = new int[3];
		int min = Math.min(c[0][0], Math.min(c[0][1], c[0][2]));
		for(int i=0;i<=min;i++){
			a[0] = i;b[0] = c[0][0] - a[0];b[1] = c[0][1] - a[0];b[2] = c[0][2];
			a[1] = c[1][0] - b[0];a[2] = c[2][1] - b[1];
			//System.out.printf("a1=%-2d a2=%-2d a3=%-2d b1=%-2d b2=%-2d b3=%-2d\n",a[0],a[1],a[2],b[0],b[1],b[2]);
			if(c[0][0]==a[0]+b[0]&&c[0][1]==a[0]+b[1]&&c[0][2]==a[0]+b[2]){
				if(c[1][0]==a[1]+b[0]&&c[1][1]==a[1]+b[1]&&c[1][2]==a[1]+b[2]){
					if(c[2][0]==a[2]+b[0]&&c[2][1]==a[2]+b[1]&&c[2][2]==a[2]+b[2]){
						System.out.println("Yes");
						System.exit(0);
					}
				}
			}
		}
		System.out.println("No");
	}
}