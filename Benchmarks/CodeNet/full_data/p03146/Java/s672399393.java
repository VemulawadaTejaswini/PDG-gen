import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		long s = scn.nextLong();
		ArrayList<Long> al = new ArrayList<Long>();
		al.add(s);
		boolean cont = true;
		while(cont) {
			long a_last = al.get(al.size()-1);
			al.add(a_last%2 == 0?a_last/2:a_last*3 + 1);
			a_last = al.get(al.size()-1);
			for(int i = 0;i < al.size()-2;i++) {
				if(a_last == al.get(i)) {
					cont = false;
					break;
				}
			}
		}
		System.out.println(al.size());
	}

}
