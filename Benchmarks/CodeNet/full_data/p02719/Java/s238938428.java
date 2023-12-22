import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
 
public class Main{
 
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner sc=new Scanner(System.in);
		
		ArrayList<Long>array=new ArrayList<>();
		long N_absolute=Math.abs(sc.nextLong());
		long K_absolute=Math.abs(sc.nextLong());
		long result=N_absolute;
	
		
		array.add(N_absolute);
		
		while(result>0) {
			result=result-K_absolute;
			array.add(Math.abs(result));
		}
		
		Collections.sort(array);
		
		System.out.println(array.get(0));
		
	}
}