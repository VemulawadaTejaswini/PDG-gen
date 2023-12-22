import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] X = new int[N];
		ArrayList<Integer> list = new ArrayList<Integer>();
		long answer = 0;
		long const_number = 1000000007;
		for(int i=0;i<N;i++) {
			list.add(sc.nextInt());
		}
		answer = count(list);
		System.out.println(answer);
	}
	
	static long factorial(long n) {
		if(n==0) {
			return 1;
		}else {
			return  n*factorial(n-1);
		}
	}
	
	static long count(ArrayList<Integer> list) {
		if(list.size()==2) {
			return list.get(1)-list.get(0);
		}else {
			long total=0;
			for(int i=0;i<list.size()-1;i++) {
				ArrayList<Integer> tmp = (ArrayList<Integer>) list.clone();
				long tmp1 = (tmp.get(i+1)-tmp.get(i));
				tmp.remove(i);
				total+=(tmp1+count(tmp))%1000000007;
			}
			return total%1000000007;
		}
	}

}