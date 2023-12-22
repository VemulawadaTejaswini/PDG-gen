
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int setSize = 0;
		String msgOut = "";
		TreeSet<Integer> hs = new TreeSet<Integer>();
		for (int i = 0; i < 3; i++) {
			hs.add(sc.nextInt());
		}
		setSize = hs.size();
		ArrayList<Integer> lst=new ArrayList<Integer>(hs);
		switch (setSize) {
		case 1:
			msgOut =String.format( "One different colors: %d",lst.get(0));
			break;
		case 2:
			msgOut = String.format( "Two different colors: %d and %d",lst.get(0),lst.get(1));
			break;
		case 3:
			msgOut =String.format(  "Three different colors: %d,%d and %d",lst.get(0),lst.get(1),lst.get(2));
			break;
		}
		System.out.println(hs.size());
		System.out.println(msgOut);

	}

}