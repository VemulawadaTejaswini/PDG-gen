import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		List<Integer> list = new ArrayList<>();
		list.add(3*5*7);
		list.add(3*5*11);
		list.add(3*5*13);
		list.add(3*3*3*5);
		list.add(3*3*3*7);
		list.sort(Comparator.naturalOrder());
		for(int i=0;i<list.size();i++) {
			if(n<list.get(i)) {
				System.out.println(i);
				break;
			}
			if(i==list.size()-1) System.out.println(list.size());
		}
		in.close();

	}

}
