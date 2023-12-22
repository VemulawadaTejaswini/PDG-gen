import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Integer> arrays=new HashSet<>();
		int cnt=1;
		int s=sc.nextInt();
		arrays.add(s);

		while(true) {
			cnt++;
			s=result(s);
			if(arrays.contains(s)) {
				System.out.println(cnt);
				break;
			}
			arrays.add(s);
		}
	}
	public static int result(int a) {
		if(a%2==0) {
			return a/2;
		}
		return 3*a+1;
	}

}