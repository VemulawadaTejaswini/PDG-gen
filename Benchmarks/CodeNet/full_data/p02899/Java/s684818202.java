import java.util.*;
public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);	
		
		Map<Integer, Integer> map = new HashMap<>();
		
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++) {
		
		map.put(new Integer(sc.nextInt()), new Integer(i));
		}
		
		for(int i = 1; i <= n; i++) {		
			System.out.print(map.get(i)+ " ");
			}
		
	}
}
