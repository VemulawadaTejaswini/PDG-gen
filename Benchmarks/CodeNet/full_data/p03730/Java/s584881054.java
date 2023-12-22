

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();

		Set<Integer>list = new HashSet<Integer>();
		int n = 1;
		while(!list.contains(0)){
			int num = (A * n) % B;
			list.add(num);
			n++;
		}

		Iterator<Integer>it = list.iterator();

		while(it.hasNext()){
			int num = it.next();
			if(num == 0)continue;

			if(C % num == 0){
				System.out.println("YES");
				break;
			}
		}

		if(!it.hasNext()){
			System.out.println("NO");
		}

		sc.close();
	}
}
