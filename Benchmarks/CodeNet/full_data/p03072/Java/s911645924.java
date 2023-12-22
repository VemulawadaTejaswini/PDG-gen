import java.util.*;

public class Main {
	public static int n, f;
	public static List<Integer> list;
	  public static void main(String[] args) {
		list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		f = sc.nextInt();
		for(int i = 0; i < n-1; i++) {
			list.add(sc.nextInt());
		}
		
		int c = 0;
		int max = f;
		for(Integer i:list) {
			if(i >= max) {
				c++;
				max = i;
			}
		}
		System.out.println(c+1);
	  }
}