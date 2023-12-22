import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String num = sc.nextLine();
		int n = Integer.valueOf(num);
		String s = sc.nextLine();
		ArrayList<Integer> r = new ArrayList<Integer>();
		ArrayList<Integer> g = new ArrayList<Integer>();
		ArrayList<Integer> b = new ArrayList<Integer>();
		for(int i=0;i<n;i++) {
			if(s.charAt(i) == 'R') {
				r.add(i);
			}else if(s.charAt(i) == 'G') {
				g.add(i);
			}else if(s.charAt(i) == 'B'){
				b.add(i);
			}
		}
		int cnt=0;
		for(int i=0;i<r.size();i++) {
			for(int j=0;j<g.size();j++) {
				for(int k=0;k<b.size();k++) {
					int array[] = {g.get(j),r.get(i),b.get(k)};
					Arrays.sort(array);
					if(array[1] - array[0] != array[2] - array[1]){
						cnt++;
					}
				}
			}
		}
	    System.out.println(cnt);
	}
}
