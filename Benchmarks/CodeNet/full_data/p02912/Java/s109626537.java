import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//String[][] array = new String[8][8];
		//List<String> list= new ArrayList<String>(Arrays.asList(s.split("")));
		List<Long> list=new ArrayList<Long>();
		int n = sc.nextInt();
		int m = sc.nextInt();
		long answer=0;
		for(int i=0;n>i;i++) {
			long a = sc.nextLong();
			answer=answer+a;
			list.add(a);
		}
		Collections.sort(list, Collections.reverseOrder());
		for(int i=0;m>i;i++) {
			if(i<m/4) {
				answer=answer-(list.get(i)-list.get(i)/2);
				list.set(i, list.get(i)/2);
			}
			else {
				int max = list.indexOf(Collections.max(list));
				//Collections.sort(list, Collections.reverseOrder());
				answer=answer-(list.get(max)-list.get(max)/2);
				list.set(max, list.get(max)/2);
			}
		}

		System.out.println(answer);
	}

}