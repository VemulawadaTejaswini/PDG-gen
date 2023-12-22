import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		in.close();
		
		List<Integer> list = new LinkedList<>();
		int n = s.length();
		char c = s.charAt(0);
		int count = 1;
		for(int i=1;i<n;i++) {
			if(s.charAt(i)==c) count++;
			else {
				list.add(count);
				count = 1;
				c = s.charAt(i);
			}
		}
		list.add(count);
		while(list.size()>2) {
			int size = list.size();
			int first = list.get(0);
			int last = list.get(list.size()-1);
			if(first>last) list.add(list.remove(size-1)+list.remove(size-2));
			else list.add(0,list.remove(1)+list.remove(0));
		}
		System.out.println(Math.max(list.get(0), list.get(1)));
	}

}
