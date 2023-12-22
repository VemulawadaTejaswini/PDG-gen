import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        double cm = sc.nextDouble();

		        double a =0;
		        double b = 0;
		        double c =0;
		        double Volume  = 0;
		        a = cm/3;
		        b = cm/3;
		        c = cm/3;
		        /*while(a != b && b != c && c != (cm/3)) {

		        }*/
		        if(a ==b &&  b == c) {
		        	Volume = a*b*c;
		        }
		        BigDecimal volume = new BigDecimal(String.valueOf(Volume));
		        BigDecimal anser = volume.setScale(12, RoundingMode.DOWN);
		        System.out.println(anser);		        }

	}


