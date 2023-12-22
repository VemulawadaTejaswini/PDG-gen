import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
public class Main{

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int store = scan.nextInt();
		int drink = scan.nextInt();
		Map<Long,Integer> sansyo = new TreeMap<Long,Integer>();

		for(int i=0;i<store;i++) {
			long money = scan.nextLong();
			int honsu = scan.nextInt();
			sansyo.put(money, honsu);
		}

		long sum = 0l;
		loop:for(Long x:sansyo.keySet()) {

			if(sansyo.get(x) >=drink) {
				sum += drink*x;
				break loop;
			}else {
				sum += sansyo.get(x)*x;
				drink -= sansyo.get(x);
			}
		}
		System.out.println(sum);
		scan.close();

	}

}
