import java.util.Scanner;
import java.lang.Math;

public class Main {
	public static void main(String[] args) throws Exception {
	Scanner sc = new Scanner(System.in);
	Long N1 = sc.nextLong();
	Long tmp = 0L;
    Long anstmpA = 999999999999L;
    Long ans = 999999999999L;      

	for(Long i = 1L ;i < N1;i++)	{
        tmp = N1 / i;
		if ((N1 % i == 0)) {
			for (Long j = 1L; j < N1; j++) {
				if ((tmp % j == 0 ) && ((tmp / j) == 1 )) {
                  ans = Math.min( i + j , anstmpA);
                  anstmpA = i + j ;                  
				}
			}
		}
	}
	System.out.println(ans -2);
    }
}
