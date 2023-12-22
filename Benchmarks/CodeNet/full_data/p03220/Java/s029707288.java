import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = sc.nextInt();
		int a = sc.nextInt();
		int h = 0;

		int result = 0;
		double min = Double.MAX_VALUE;
		for (int i=1; i<=n; i++) {
			h = sc.nextInt();
			if (Math.abs(t-h*0.006-a) < min) {
				min = Math.abs(t-h*0.006-a);
				result = i;	
			}
		}
		System.out.print(result);
    }
}