import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (Scanner sc = new Scanner(System.in)) {
			double w_x, h_y, x, y;
			w_x = sc.nextDouble();
			h_y = sc.nextDouble();
			x = sc.nextDouble();
			y = sc.nextDouble();
			
			if (w_x == x && h_y == y) {
				double ans = w_x * h_y*0.5;
				System.out.print(String.format("%.9f", ans));
				System.out.print(" ");
				System.out.println("0");
				return;
			} else if (x == 0 && y == 0) {
				double ans = w_x * h_y*0.5;
				System.out.print(String.format("%.9f", ans));
				System.out.print(" ");
				System.out.println("0");
				return;
			}
			
			double minSq = w_x*h_y;
			double tmpSq = w_x*y;
			minSq = minSq - tmpSq;
			
			minSq = Math.min(minSq, tmpSq);
			
			double minSq2 = w_x*h_y;
			double tmpSq2 = x*h_y;
			minSq2 = minSq2 - tmpSq2;
			minSq2 = Math.min(minSq2, tmpSq2);
			
			double minSqMax = Math.max(minSq, minSq2);
			
			System.out.print(String.format("%.9f", minSqMax));
			
			System.out.print(" ");

			if (minSq == minSq2) System.out.println("1");
			else System.out.println("0");
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
