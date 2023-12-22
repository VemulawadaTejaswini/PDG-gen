import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		Map<Integer, Character> map = new HashMap();
		char[] work = new char[s.length()];

		for(int i = 0; i < s.length(); i++){
            work[i] = s.charAt(i);
         }

		for (int i = 0; i < s.length(); i++){
			map.put(i+1, work[i]);
		}

		long sum = 0;

		for (Entry<Integer, Character> entry1 : map.entrySet()) {
			for (Entry<Integer, Character> entry2 : map.entrySet()) {
				for (Entry<Integer, Character> entry3 : map.entrySet()) {

					if (entry1.getKey() > entry2.getKey() || entry2.getKey() > entry3.getKey() ){
						continue;
					}

					if (entry2.getKey() - entry1.getKey() == entry3.getKey() - entry2.getKey()){
						continue;
					}

					if ( entry1.getValue().equals( entry2.getValue() ) ){
		            	continue;
		            } else if( entry1.getValue().equals( entry3.getValue() ) ){
		            	continue;
		            } else if( entry2.getValue().equals( entry3.getValue() ) ){
		            	continue;
		            }

					sum++;
		        }
	        }
        }
		System.out.println(sum);

	}

}
