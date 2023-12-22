import java.util.*;

public class Main{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ArrayList<String> list = new ArrayList<>();
		for(int i = 0; i < N; i++) {
			String s = sc.next().chars()
		    	      .sorted()
		    	      .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
		    	      .toString();
			list.add(s);
		}
		list.sort(null);
		list.add("");
		
		sc.close();
		
		long count = 1;
		long result = 0;
		for(int i = 1; i < list.size(); i++) {
			if(list.get(i).equals(list.get(i - 1))) {
				count++;
			}
			else {
				result += (count * (count - 1))/2;
				count = 1;
			}
		}
		System.out.println(result);
	}
}