import java.util.*;
// cin=sc.nextInt();
// List<Integer> a = new ArrayList<Integer>(n);
 
public class Main {
    public static void main(String args[]){
		    Scanner sc = new Scanner(System.in);	
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int e = Math.max(a, b);
			e = Math.max(b, c);
			System.out.println(a+b+c+e*9);
	}
}