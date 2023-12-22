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
		for(int i=0;n>i;i++) {
			long a = sc.nextLong();
			list.add(a);
		}
		Collections.sort(list, Collections.reverseOrder());
		for(int i=0;m>i;i++) {
			//int max = list.indexOf(Collections.max(list));
			//Collections.sort(list, Collections.reverseOrder());
			for(int j=0;n>j;j++) {
				if(list.get(j)>=list.get(j+1)) {
					list.set(j, list.get(j)/2);
					break;
				}
			}
		}
		long answer=0;

		for(int i=0;n>i;i++) {
			answer=answer+list.get(i);
		}

		System.out.println(answer);
	}

}