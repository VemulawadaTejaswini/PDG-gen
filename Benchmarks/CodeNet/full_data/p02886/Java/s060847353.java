import java.util.*;

public class Main{
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args){
		int n = sc.nextInt();
		List<Integer> d = new ArrayList<>(n);
		for(int i = 0; i < n; ++i){
			d.add(sc.nextInt());
		}
		
		System.out.println(calcSum(n, d));
	}
	
	static int calcSum(int n, List<Integer> d){
		int res = 0;
		
		for(int i = 0; i < n - 1; ++i){
			for(int j = i + 1; j < n; ++j){
				res += d.get(i) * d.get(j);
			}
		}
		
		return res;
	}
}