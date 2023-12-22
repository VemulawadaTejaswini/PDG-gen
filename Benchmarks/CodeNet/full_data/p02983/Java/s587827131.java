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
			
			
			
			for (long i = 0; i < dif - 1; i++) {
				
				long tmpL = l + i;
				
				tmpL = tmpL % A;
				minI = Math.min(minI, tmpL);
				
				for (long j = i + 1; j < dif; j++) {
					
					long tmpR = r + j;
					
					tmpR = tmpR % A;
					minJ = Math.min(minJ, tmpR);
					
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
