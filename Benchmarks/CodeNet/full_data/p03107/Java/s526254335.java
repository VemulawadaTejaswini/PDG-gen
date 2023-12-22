import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char[] c = s.toCharArray();

		LinkedList<Character> list = new LinkedList<Character>();
		for(char cc:c){
			list.add(cc);
		}

		int cnt=0;
		boolean end=false;

		while(!end){
			for (int i=0; i<(list.size()-1); i++) {
				if(list.get(i) != list.get(i+1)){
					list.remove(i);
					list.remove(i);
					cnt += 2;
					break;
				}
				if(i == list.size()-2) end = true;
			}
		}
		System.out.println(cnt);
		return;
	}
}