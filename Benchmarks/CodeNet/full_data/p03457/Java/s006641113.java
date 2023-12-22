import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] array = new int[n][3];
		for(int i=0;i<n;i++) {
			array[i][0] = sc.nextInt();
			array[i][1] = sc.nextInt();
			array[i][2] = sc.nextInt();
		}
		int x=0,y=0,t=0,i;
		for(i=0;i<n;i++) {
			int sub = array[i][0]-t;
			if((x+y)%2==0 ) {
				if(sub%2==0) {
					if((array[i][1]+array[i][2])%2!=0) break;
				}else {
					if((array[i][1]+array[i][2])%2==0) break;
				}
			}else {
				if(sub%2==0) {
					if((array[i][1]+array[i][2])%2==0) break;
				}else {
					if((array[i][1]+array[i][2])%2!=0) break;
				}
			}
			if(MHD(x,y,array[i][1],array[i][2])>sub) break;
			x=array[i][1];
			y=array[i][2];
			t=array[i][0];
		}
		if(i==n) System.out.println("Yes");
		else System.out.println("No");
	}

	public static int MHD(int x, int y, int a, int b) {
		return Math.abs(x-a)+Math.abs(y-b);
	}
}