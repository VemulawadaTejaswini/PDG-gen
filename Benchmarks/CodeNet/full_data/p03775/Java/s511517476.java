package ProCon;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		long n=scanner.nextLong();
		List<Long> list = new ArrayList<Long>();
		list.add((long)1);
		while(n % 2 == 0){
			n = n / 2;
			list.add((long) 2);
		}

		for(int i = 3; i*i <= n; i += 2){
			while(n % i == 0){
				n = n / i;
				list.add((long) i);
			}
		}
		if(n > 1){
			list.add(n);
		}

		list.sort(Comparator.reverseOrder());

		long l = list.get(0);
		long s = list.get(1);

		for(int i = 2; i < list.size(); i++){
			s = s * list.get(i);
			if(l < s){
				long temp = l;
				l = s;
				s = temp;
			}
		}
		System.out.println("l :" + l + ", s :" + s);
		int p = String.valueOf(l).length();
		int q = String.valueOf(s).length();

		if(p < q){
			System.out.println(q);
		}else{
			System.out.println(p);
		}
	}
}