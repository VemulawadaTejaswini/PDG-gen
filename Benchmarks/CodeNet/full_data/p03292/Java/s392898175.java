import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner in = new java.util.Scanner(System.in);
		int N1 = in.nextInt();
		int N2 = in.nextInt();
		int N3 =  in.nextInt();
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(N1);
		if(N1 < N2) {
			list.add(N2);
		}else {
			list.add(0, N2);
		}
		if(N3 < list.get(0)) {
			list.add(0, N3);
		}else if(N3 < list.get(1)) {
			list.add(1, N3);
		}else {
			list.add(N3);
		}
	
		System.out.println(list.get(2)-list.get(0));
	
		in.close();
		
	}
}