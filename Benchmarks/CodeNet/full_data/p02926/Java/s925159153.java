import java.util.*;
import java.math.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		List<Long> xList = new ArrayList<>();
		List<Long> yList = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			xList.add(sc.nextLong());
			yList.add(sc.nextLong());
		}

		long max = 0;
		for (int i = 0; i < n; i++) {
			// System.out.println("i " + i);
			long currentX = xList.get(i);
			long currentY = yList.get(i);
			long currentL = currentX * currentX + currentY * currentY;
			for (int j = 0; j < n; j++) {
				if(i==j){
					continue;
				}
				// System.out.println("j " + j);


				long newX = xList.get(j);
				long newY = yList.get(j);
				// System.out.println("newX " + newX);
				// System.out.println("newY " + newY);

				long provisonalX = currentX + newX;
				long provisonalY = currentY + newY;

				long provisonalL = provisonalX * provisonalX + provisonalY * provisonalY;
				if(currentL <= provisonalL){
					currentL = provisonalL;
					currentX = provisonalX;
					currentY = provisonalY;
				}
				// System.out.println("provisonalL " + provisonalL);
				// System.out.println("provisonalX " + provisonalX);
				// System.out.println("provisonalY " + provisonalY);
				// System.out.println("currentL <= provisonalL " + (currentL <= provisonalL));

			}
				// System.out.println("currentL " + currentL);

			max = Math.max(max, currentL);
		}
		double result = Math.sqrt(max);

		System.out.println(result);


	}
}
