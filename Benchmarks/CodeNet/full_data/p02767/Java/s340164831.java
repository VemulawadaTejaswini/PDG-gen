import java.util.*;
import java.math.*;
public class Main {
  
		public static int poww(int a, int b){
			return (a-b)*(a-b);
		}
  
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int sum = 2147483647;
       // int d = new int[K];
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int d = sc.nextInt();
			a.add(d);
            }
        
		for (int i=1; i<101;i++){
			int temp = 0;
			for (int j=0; j<a.size();j++)
			{
				temp += poww(i,a.get(j));
			}
			if(temp<sum) {sum = temp;}
        }
		System.out.println(sum);
	}
}