import java.util.Scanner;
 
public class Main{
 
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner sc=new Scanner(System.in);
		
		long N_absolute=Math.abs(sc.nextLong());
		long K_absolute=Math.abs(sc.nextLong());
		long result=N_absolute;
		long hiki=0;

		result=N_absolute%K_absolute;
		
		if(N_absolute<K_absolute) {
			System.out.println(N_absolute);
		}else if(result==0) {
			hiki=result-K_absolute;
			hiki=Math.abs(hiki);
			if(result>hiki) {
				System.out.println(hiki);
			}else {
				System.out.println(result);
		}
		}
		
	}
}