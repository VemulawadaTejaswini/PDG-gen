import java.util.*;

public class Main {
	static int n, v, c;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		String[] vs = sc.next().split(" ");
		String[] cs = sc.next().split(" ");
		
		for(int i = 0; i < n; i++) {
			if(Integer.parseInt(vs[i]) - Integer.parseInt(cs[i]) > 0) {
				v+=Integer.parseInt(vs[i]);
				c+=Integer.parseInt(cs[i]);
			}
		}
		System.out.println(v-c);
	}
}