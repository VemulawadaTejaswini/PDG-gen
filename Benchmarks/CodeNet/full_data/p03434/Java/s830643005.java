import java.util.*;
import java.math.*;
public class Main {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int sum = 0;
		
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < K; i++) {
            int d = sc.nextInt();
			a.add(d);
		}
		Collections.sort(a,Collections.reverseOrder());	
		
		for(int i=0; i<a.size();i++)
		{
			sum += (Math.pow((-1),(i)))*(a.get(i));
		}
		System.out.println(sum);
   
        }
		
	}