import java.util.*;

public class Main {

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		List<Integer> a = new ArrayList<>();
		
		while(sc.hasNextInt()){
			a.add(sc.nextInt());
		}
		
		int x = 0;
		int c=0;
		
		for(int i = 1; i < n-1; i++){
			
			int a_nm = a.get(i-1);
			int a_n = a.get(i);
			int a_np = a.get(i+1);
			
			if(a_nm==a_n && a_n==a_np){
				x++;
				i = i+1;
			}
			else if(a_nm==a_n){
				x++;
				i = i+1;
			}
		}
		System.out.print(x);	
	}
}