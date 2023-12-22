import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		List<Integer> a = new ArrayList<>();
		
		for(int i = 0; i < n; i++){
			a.add(sc.nextInt());
		}
		sc.close();
		
		a.sort(Comparator.comparing(I -> I));
		System.out.println(isAbleArray(a)? count(n) % 1_000_000_007L: 0);
		
	}
	
	static boolean isAbleArray(List<Integer> list){
		if(list.size() % 2 == 0){
			int k = 1;
			for(int i = 0; i < list.size(); i++){
				if(list.get(i) != k) return false;
				if(i % 2 == 1) k = k + 2;
			}
		}else{
			int k = 0;
			for(int i = 0; i < list.size(); i++){
				if(list.get(i) != k) return false;
				if(i % 2 == 0) k = k + 2;
			}
		}
		return true;
	}
	
	static long count(int n){
		long result = 1;
		if(n % 2 == 1){
			for(int i = 0; i < (n - 1)/2; i++){
				result *= 2;
			}
		}else{
			for(int i = 0; i < n / 2; i++){
				result *= 2;
			}
		}
		return result;
	}
}
