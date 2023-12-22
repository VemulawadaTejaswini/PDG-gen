import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);

		ArrayList<Integer>a=new ArrayList<Integer>();
		for(int i=0;i<6;i++)a.add(sc.nextInt());
		Collections.sort(a);
		for(int i=0;i<a.size()-1;i++) {
			if(a.get(i)==a.get(i+1)) {
				a.remove(i);a.remove(i);i--;
			}
		}
		System.out.println(a.size());
		if(a.size()==2)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}
