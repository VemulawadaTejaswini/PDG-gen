
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> num = new ArrayList<Integer>();
		ArrayList<String> param = new ArrayList<String>();
		int system = 0; // 文字の空白区切り 0:ON 1:OFF

		while (sc.hasNext()) {
			if (sc.hasNextInt()) {
				num.add(sc.nextInt());
			} else {
				if (system == 0)
					param.add(sc.next());
				if (system == 1)
					param.add(sc.nextLine());
			}
		}
		Method(num, param);
	}

	static void Method(ArrayList<Integer> num, ArrayList<String> param) {
		BigInteger area = BigInteger.valueOf(num.get(0)).multiply(BigInteger.valueOf(num.get(1)));
		BigInteger min = new BigInteger(String.valueOf(Math.min(num.get(0), num.get(1))));;
		BigInteger max = new BigInteger(String.valueOf(Math.max(num.get(0), num.get(1))));
		BigInteger small = new BigInteger("0");
		BigInteger big = new BigInteger("0");

		BigInteger two = new BigInteger("2");
		BigInteger three = new BigInteger("3");
		

		if(area.remainder(new BigInteger("3")).compareTo(BigInteger.ZERO) == 0){

		}else if(area.remainder(new BigInteger("2")).compareTo(BigInteger.ZERO) == 0){
			small = max.divide(three).multiply(min);
			small = small.subtract((area.subtract(small)).divide(two));

			big = (max.divide(three).add(BigInteger.ONE)).multiply(min);
			big = big.subtract((area.subtract(big)).divide(two));
		}else{
			System.exit(1);
			small = max.divide(three).multiply(min);
			small = area.subtract(small).subtract((area.subtract(small)).divide(min).multiply(min.divide(two))).subtract(small);

			big =  (max.divide(three).add(BigInteger.ONE)).multiply(min);
			big = big.subtract((area.subtract(big)).divide(min).multiply(min.divide(two)));
		}
		if(small.abs().compareTo(big.abs()) > 0){
			System.out.println(big.abs());
		} else {
			System.out.println(small.abs());
		}
		//System.out.println(small);
		//System.out.println(big);
	}
}