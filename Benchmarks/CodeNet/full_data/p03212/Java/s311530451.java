
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	static Set<Long> set = new HashSet<>();
	static long num;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		num = sc.nextLong();
		mat(0);
		long count = 0;
		for(Long s : set) {
			if(s.toString().matches("^(?=.*3)(?=.*5)(?=.*7)")) {
				count++;
			}
		}
		System.out.println(count);
	}

	public static void mat(long s) {
		long tmp = s * 10 + 3;
		if(tmp <= num) {
			set.add(tmp);
			mat(tmp);
		}
		tmp = s * 10 + 5;
		if(tmp <= num) {
			set.add(tmp);
			mat(tmp);
		}
		tmp = s * 10 + 7;
		if(tmp <= num) {
			set.add(tmp);
			mat(tmp);
		}
	}

}
