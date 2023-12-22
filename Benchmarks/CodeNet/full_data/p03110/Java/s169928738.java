import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try(Scanner sc = new Scanner(System.in)){
			int N = Integer.parseInt(sc.nextLine());
			String[] target = new String[N*2];
			
			for(int i = 0; i < target.length; i ++) {
				target[i] = sc.next();
			}
			
			BigDecimal ret = new BigDecimal("0");
			BigDecimal mulVal = new BigDecimal("380000");
			for(int i = 0; i < target.length; i += 2) {
				if(target[i + 1].equals("JPY")) {
					ret = ret.add(new BigDecimal(target[i]));
				} else {
					ret = ret.add((new BigDecimal(target[i])).multiply(mulVal));
				}
			}
			System.out.println(ret);
		}
	}
	
}
