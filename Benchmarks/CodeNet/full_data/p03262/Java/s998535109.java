import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Zahyou = sc.nextInt();

		List<Integer> list = new ArrayList<>();
		for(int i = 0; i < N; i++) {
			list.add(sc.nextInt());
		}
		list.add(Zahyou);
		Collections.sort(list);
	    //System.out.println(list);



		int kyori = 1000000001;
		int num = 0;
		for(int i = 0; i < N; i++) {
			num = list.get(i+1) - list.get(i);
			//System.out.println(list.get(i+1));
			if(kyori == 1000000001) {
				if(num != 0) {
				kyori = num;
				}
			}
			if(kyori > num && num != 0) {
				//System.out.println(kyori + " " +num);
				kyori = gcd(kyori,num);

			}
			//System.out.println(list.get(i));
		}

		if(kyori == 1000000001) {
			kyori = 0;
		}
		System.out.println(kyori);
		sc.close();
	}


	//最大公約数gcd
	static int gcd (int a, int b) {
		if(b % a == 0) {
			return a;
		}
		if(a % b == 0) {
			return b;
		}

		int temp;
		while((temp = a%b)!=0) {
			a = b;
			b = temp;
		}
		return b;
	}

}
