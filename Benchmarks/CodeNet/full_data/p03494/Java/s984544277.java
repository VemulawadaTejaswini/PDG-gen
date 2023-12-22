import java.util.*;
public class Main {
	static int cnt = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 0;i < n;i++) {
			list.add(sc.nextInt());
		}
		boolean flag = false;
		while(!flag) {
			for(int i = 0;i < n;i++) {
				int a = list.get(i);
				if(a % 2 == 0) {
					a = a / 2;
					list.set(i, a);
				}else {
					flag = true;
					break;
				}
			}
			if(!flag)cnt++;
		}
		System.out.print(cnt);
	}

}