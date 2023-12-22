import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int K = sc.nextInt();
		
		ArrayList<String> strlist = new ArrayList();
		int length =str.length();
		for(int from =0;from<=length;from++) {
				for(int to =from+1;to<=length;to++) {
					String substr=str.substring(from, to);
					boolean match=false;
					for(String st : strlist) {
						if(st.equals(substr)) {
							match=true;
							break;
						}
					}
					if(!match) {
						strlist.add(substr);
					}
				}
		}
		Collections.sort(strlist);
		System.out.println(strlist.get(K-1));
	}
}