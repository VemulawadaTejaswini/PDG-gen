import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}



	public void run() {
		Scanner sc = new Scanner(System.in);
		char ss[] = sc.next().toCharArray();
		char t[] = sc.next().toCharArray();
		char s[] = Arrays.copyOf(ss, ss.length);
		ArrayList<String> aList = new ArrayList<String>();
		for(int i=0; i<s.length-t.length+1; i++) {
			boolean ok=true;
			for(int j=0; j<t.length; j++) {
				if(s[i+j] != '?' && s[i+j] != t[j]) {
					ok=false;
					break;
				}
			}
			if(ok) {
				StringBuilder sb = new StringBuilder();
				for(int j=0; j<t.length; j++) {
					s[i+j]=t[j];
				}
				for(int j=0; j<s.length; j++) {
					sb.append(s[j]);
				}
				aList.add(sb.toString().replaceAll("\\?", "a"));
				s = Arrays.copyOf(ss, ss.length);
			}
		}
		Collections.sort(aList);
		if(aList.size()==0) {
			System.out.println("UNRESTORABLE");
		} else {
			System.out.println(aList.get(0));
		}
		sc.close();
	}

}
