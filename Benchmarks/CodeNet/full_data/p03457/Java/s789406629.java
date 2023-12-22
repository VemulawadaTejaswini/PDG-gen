import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[][] way= new int[n][3];

		for(int i =0;i<3*n;i++){
			int b=i%3;
			int a=(i-b)/3;
			int m = sc.nextInt();
			way[a][b]= m;
		}

		boolean koike = true;
		for(int i = 0;i<n-1;i++){
			koike &= judge(way[i][0],way[i][1],way[i][2],way[i+1][0],way[i+1][1],way[i+1][2]);
		}
		koike &= judge(0,0,0,way[0][0],way[0][1],way[0][2]);
		if(koike){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
	private static boolean judge(int a,int b, int c, int d, int e, int f){
		int t = d-a;
		int distance = Math.abs(e-b)+Math.abs(f-c);
		return t>=distance && (t-distance)%2==0;
	}
}
