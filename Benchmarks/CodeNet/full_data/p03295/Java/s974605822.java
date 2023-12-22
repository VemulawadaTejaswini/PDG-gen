import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		List<int[]> list = new ArrayList<>();
		for(int i=0;i<m;i++) {
			int[] a = new int[2];
			a[0] = in.nextInt();
			a[1] = in.nextInt();
			list.add(a);
		}
		list.sort((a1,a2)->a1[1]-a2[1]);
		List<Integer> remove = new ArrayList<>();
		for(int[] a : list) {
			boolean solved = false;
			for(int bridge : remove) {
				if(a[0]<=bridge && bridge<a[1]) {
					solved = true;
					break;
				}
			}
			if(!solved) remove.add(a[1]-1);
		}
		System.out.println(remove.size());
	}

}
