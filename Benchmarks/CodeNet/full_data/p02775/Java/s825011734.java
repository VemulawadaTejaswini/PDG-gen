import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
		//ArrayList<Long> list = new ArrayList<Long>();
		Scanner in = new Scanner(System.in);
		String n = in.nextLine();
		int sum=0;
		boolean flag = false;
		for(int i=n.length()-1; i>=0; i--) {
			int v = Character.getNumericValue(n.charAt(i));
			if(v<=5) {
				sum+=v;
				flag = false;
			}
			else {
				if(flag==false) {
					sum += 10-v+1;
					flag = true;
				}else {
					sum += 9-v;
				}
			}
		}
		System.out.println(sum);
	}
}
