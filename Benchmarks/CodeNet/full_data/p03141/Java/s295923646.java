



import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Dish> li = new ArrayList<>();
		
		for (int i=0;i<n;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			Dish d = new Dish();
			d.a=a;
			d.b=b;
			
			li.add(d);
		}
		
		li.sort(Comparator.comparing((d) -> d.a+d.b));
		
		long ans = 0;
		
		for (int i=0;i<n;i++) {
			if (i%2==0) {
				ans += li.get(0).a;
				li.remove(0);
			} else {
				ans -= li.get(0).b;
				li.remove(0);
			}
		}

		System.out.println(ans);
	}



}

class Dish  {
	int a;
	int b;
}
