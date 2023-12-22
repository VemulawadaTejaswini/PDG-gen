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
	if(length<50) {
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
	}else {
		int mincode=Integer.MAX_VALUE;
		for(int from =0;from<=length;from++) {
			int st = str.codePointAt(from);
			Math.min(mincode, st);
		}
		ArrayList<Integer> strat = new ArrayList();
		for(int from =0;from<=length;from++) {
			if(mincode == str.codePointAt(from)) {
				strat.add(from);
			}
		}
		for(int from : strat) {
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
	}
	}
}
