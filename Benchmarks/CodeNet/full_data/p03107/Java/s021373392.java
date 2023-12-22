import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		char[] s1 = sc.next().toCharArray();
		List<Integer> s2 = new LinkedList<>();
		for(int i = 0; i < s1.length; i++) {
			s2.add(Integer.parseInt(String.valueOf(s1[i])));
		}
		int flag = 2;
		int ans = 0;
		while(flag == 2) {
			flag = -1;
			for(int i = 0; i < s2.size(); i++) {
				if(flag == 0) {
					if(s2.get(i) == 1) {
						ans++;
						flag = 2;
						s2.remove(i - 1);
						s2.remove(i - 1);
						break;
					}
				}else if(flag == 1) {
					if(s2.get(i) == 0) {
						ans++;
						flag = 2;
						s2.remove(i - 1);
						s2.remove(i - 1);
						break;
					}
				}else if(flag == -1) {
					if(s2.get(i) == 0) flag = 0;
					else flag = 1;
				}
			}
		}
		
		System.out.println(ans * 2);
	}
}