import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String[] Sarray = S.split("");
		List<String> Slist = new ArrayList<String>();
		for(int i = 0; i < S.length(); i++) {
			Slist.add(Sarray[i]);
		}
		int answer = 0;
		while(true) {
			boolean finished = true;
			for(int i = 0; i < Slist.size()-1; i++) {
				if(!Slist.get(i).equals(Slist.get(i+1))) {
					Slist.remove(i+1);
					Slist.remove(i);
					answer += 2;
					finished = false;
				}
			}
			if(finished) break;
		}
		System.out.println(answer);
		}

}