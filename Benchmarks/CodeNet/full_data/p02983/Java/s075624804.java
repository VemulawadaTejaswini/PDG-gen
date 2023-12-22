import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (Scanner sc = new Scanner(System.in)) {
			long l, r;
			l = sc.nextLong();
			r = sc.nextLong();
			
			long dif = r - l;
			
			long A = 2019;
			
			l = l % A;
			r = r % A;
			
			long minI = l;
			long minJ = r;
			
			
			
			for (long i = l; i < dif - 1; i++) {
				i = i % A;
				minI = Math.min(minI, i);
				for (long j = i + 1; j < dif; j++) {
					j = j % A;
					minJ = Math.min(minJ, j);
					
					if (minI == 0 || minJ == 0) {
						System.out.println("0");
						return;
					}
				}
			}
			
			System.out.println(minI*minJ);
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}
}
