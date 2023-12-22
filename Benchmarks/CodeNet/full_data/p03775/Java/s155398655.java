import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Long n = Long.parseLong(scan.next());
		List<Long> list = new ArrayList<>();
		list = bunkai(n);
		int a = 1;
		int b = 1;

		boolean b1 = false;
		for(long i : list){
			b1 = !b1;
			if(b1)a *= i;
			else b *= i;
		}
		System.out.println(F(a,b));
	}

	static int F(Integer a ,Integer b){
		String as = a.toString();
		String bs = b.toString();
		return as.length() > bs.length() ? as.length() : bs.length();
	}
	static List<Long> bunkai(long n){
		long half = n / 2;
		int i = 2;
		List<Long> list = new ArrayList<>();
		while(true){
			if(n % i == 0){
				n /= i;
				half = n / 2;
				list.add((long)i);
				//System.out.println(i+" "+n);
			}else{
				i++;
			}
			if(i > half)break;
		}
		list.add(n);
		return list;
	}

}