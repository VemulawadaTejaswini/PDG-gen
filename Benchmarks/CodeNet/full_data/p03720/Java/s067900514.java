import java.util.Scanner;

public class Main{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int m = scan.nextInt();

		int[] m_sum = new int[m];
		
		for(int i = 0 ; i < n ; i++){
			
			int a = scan.nextInt() - 1;
			int b = scan.nextInt() - 1;
			m_sum[a]++;
			m_sum[b]++;
			
		}
		
		for(int i = 0 ; i < m ; i++){
			
			System.out.println(m_sum[i]);

		}
	}
}