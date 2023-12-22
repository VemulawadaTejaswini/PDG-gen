import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		Restaurant[] arr = new Restaurant[n];
		for (int i = 0; i < n; i++) {
			String s = sc.next();
			int p = sc.nextInt();
			arr[i] = new Restaurant(i + 1, s, p);
		}
		
		Arrays.sort(arr, (r1, r2) -> {
			int dif = r1.city.compareTo(r2.city);
			if (dif == 0) dif = r2.point - r1.point;
			return dif;
		});
		
		for (Restaurant r : arr)
			System.out.println(r.no);

		sc.close();
	}
	
}

class Restaurant {
	int no;
	String city;
	int point;
	
	public Restaurant(int no, String s, int p) {
		this.no = no;
		this.city = s;
		this.point = p;
	}
}


