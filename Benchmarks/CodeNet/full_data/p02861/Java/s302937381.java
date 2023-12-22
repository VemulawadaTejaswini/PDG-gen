import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[][] cod = new int[n][2];
		double[] ds = new double[(int)Math.pow(2,n)];

		cod[0][0] = 0;
		cod[0][1] = 0;
		boolean flag = true;

		for(int i =0; i < n; i++) {
			cod[i][0] = sc.nextInt();
			cod[i][1] = sc.nextInt();
		}
		

		for(int i =0 ; i< ds.length;i++) {
			int x = cod[i][0] - cod[i-1][0];
			int y = cod[i][1] - cod[i-1][1];
			ds[i] = distance(x,y); 
			if(x - y < 0 || (x -y) % 2 == 1) {
				flag = false;
			}
		}
		if(flag) {
			
			System.out.println(sum(ds)/(Math.pow(2,n)));
		}else {
			System.out.println("No");
		}

	}
	public static double distance(int x, int y) {
		double res = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
		return res;
	}
	public static double sum(double[] de) {
		double sum = 0;
		for(double i : de) {
			sum += i;
		}
		return sum;
	}

}