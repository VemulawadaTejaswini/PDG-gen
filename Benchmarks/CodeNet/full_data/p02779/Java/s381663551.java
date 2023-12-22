import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> c = new ArrayList<>();
		for(int i=0;i<n;i++){
			int a = sc.nextInt();
			if(c.contains(a)){
				System.out.println("NO");
				return;
			}else{
				c.add(a);
			}
		}
		sc.close();
		System.out.println("YES");
	}
}
