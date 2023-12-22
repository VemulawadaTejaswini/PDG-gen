
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		TreeSet<Integer> tset=new TreeSet<>();
		tset.add(scn.nextInt());
		tset.add(scn.nextInt());
		tset.add(scn.nextInt());
		tset.add(scn.nextInt());
		tset.add(scn.nextInt());

		int k=scn.nextInt();
		int first=tset.first();
		if(tset.ceiling(first+k+1)!=null) {
			System.out.println(":(");
		}else {
			System.out.println("Yay!");
		}
	}

}
