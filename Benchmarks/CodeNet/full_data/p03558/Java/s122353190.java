import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int k = in.nextInt();
		in.close();
		int[] mod = new int[k];
		int INF = 100000;
		for(int i=0;i<k;i++) {
			mod[i] = INF;
		}
		List<Integer> list = new LinkedList<>();
		mod[1] = 1;
		list.add(0, 1);
		while(mod[0]==INF) {
			int x = list.remove(0);
			if(mod[(x*10)%k]>mod[x]) {
				mod[(x*10)%k] = mod[x];
				list.add(0,(x*10)%k);
			}
			if(mod[(x+1)%k]>mod[x]+1) {
				mod[(x+1)%k] = mod[x]+1;
				list.add(list.size(),(x+1)%k);
			}
		}
		System.out.println(mod[0]);
		
	}
}
