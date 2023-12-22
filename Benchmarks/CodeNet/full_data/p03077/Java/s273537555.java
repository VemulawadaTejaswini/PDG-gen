
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		long[] a = new long[6];

		for(int i=0; i<6; i++){
			a[i] = Long.parseLong(sc.next());
		}
		
		long max = 0L;
		long max_i = 1L;
		for(int i=1; i<6; i++){
			long tmp_max;
			
				tmp_max = a[0]/a[i] ;
			
			if (tmp_max > max){
				max = tmp_max;
				max_i = i;
			}
		}
		long ans = max + 5;
		
		
		System.out.println(ans);

		sc.close();
	}
	
}
