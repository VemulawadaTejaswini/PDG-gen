import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//List<String> list= new ArrayList<String>(Arrays.asList(s.split("")));
		List<Integer> list=new ArrayList<Integer>();
		//Integer[][] array = new Integer[n][m];
		long num = sc.nextLong();
		if(isPrime(num)==true) {
			System.out.println(num-1);
		}
		else {
			for(int i=2;num+1>i;i++) {
				if(num%i==0) {
					list.add(i);
					num=num/i;
					i=1;
				}
				//System.out.println(i);
			}
			//System.out.println(list);
			for(int i=0;list.size()-2>i;i++){
				Collections.sort(list);
				int a = list.get(0)*list.get(1);
				list.remove(0);
				list.remove(1);
				list.add(a);
			}
			//System.out.println(list);

			System.out.println(list.get(0)+list.get(1)-2);
		}
	}

	public static boolean isPrime(long num) {
		if (num < 2) return false;
		else if (num == 2) return true;
		else if (num % 2 == 0) return false; // 偶数はあらかじめ除く

		double sqrtNum = Math.sqrt(num);
		for (int i = 3; i <= sqrtNum; i += 2)
		{
			if (num % i == 0)
			{
				// 素数ではない
				return false;
			}
		}

		// 素数である
		return true;
	}
}

