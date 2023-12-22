import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
 
 
public class Main {

	static long MOD = 1_000_000_007;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//int N = Integer.parseInt(sc.next());
		//long L = Long.parseLong(sc.next());
		int INF = 1_000_000_007;
		Scanner sc = new Scanner(System.in);
		//char[] A = sc.next().toCharArray();
		int N = Integer.parseInt(sc.next());
		int[] A = new int[N];
		boolean hasNonZero = true;
		Set<Integer> set = new HashSet<>();
		for(int i=0; i<N; i++){
			A[i] = Integer.parseInt(sc.next());
			set.add(A[i]);
			if(A[i] != 0)hasNonZero=false;
		}
		
		Arrays.sort(A);
		
		if(hasNonZero){
			System.out.println("Yes");
		}else if(!(set.size() == 3)){
			System.out.println("No");
		}else if(set.size() == 3){
			List<Integer> list = new ArrayList<>(set);
			boolean flag = false;
			if(((list.get(0)^list.get(1)) == list.get(2))
					&& ((list.get(1)^list.get(2)) == list.get(0))
					&& ((list.get(2)^list.get(0)) == list.get(1))){
				flag = true;
			}
			int count1 = 0;
			int count2 = 0;
			int count3 = 0;
			int number1=list.get(0);
			int number2=list.get(1);
			int number3=list.get(2);
			
			for(int c_ : A){
				if(c_ == number1)count1++;
				if(c_ == number2)count2++;
				if(c_ == number3)count3++;
			}
			
			if(!(count1==count2 && count2==count3))flag=false;
			
			if(flag){
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}
		}
		
		
		
	}
	static long lcm (long a, long b) {
		long temp;
		long c = a;
		c *= b;
		while((temp = a%b)!=0) {
			a = b;
			b = temp;
		}
		return (c/b);
	}
}

