import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
 
public class Main{
 
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner sc=new Scanner(System.in);
		
		Set<Long>array=new TreeSet<>();
		long N_absolute=Math.abs(sc.nextLong());
		long K_absolute=Math.abs(sc.nextLong());
		long result=N_absolute;
	
		
		array.add(N_absolute);
		
		while(result>0) {
			result=result-K_absolute;
			result=Math.abs(result);
			array.add(result);
		}
		
		System.out.println(((TreeSet<Long>) array).first());
		
	}
}