import java.util.*;
import java.math.RoundingMode;
import java.math.BigDecimal;
 
 
 
public class Main{
	 public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = -1;
		for(int i = 0; i <= 50000; i++) {
			if(Math.floor(i*(1.08))==n) {
				ans = i;
				break;
			}
		}
		if(ans == -1) System.out.println(":(");
		else System.out.println(ans);
	 }
}