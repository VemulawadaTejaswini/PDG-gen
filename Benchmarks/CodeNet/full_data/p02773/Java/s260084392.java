import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//List<String> list=new ArrayList<String>(Arrays.asList(s.split("")));
		List<String> list=new ArrayList<String>();
		//int[] array = new int[1000000000*2];
		int n = sc.nextInt();
		for(int i=0;n>i;i++) {
			String a = sc.next();
			list.add(a);
		}
		Collections.sort(list);
		List<Integer> list_count=new ArrayList<Integer>();
		for(int i=0;n-1>i;i++) {
			int count=0;
			if(list.get(i).equals(list.get(i+1))) {
				count++;
				i++;
				while(true) {
					if(i==n-1)
						break;
					if(!list.get(i).equals(list.get(i+1)))
						break;
					count++;
					i++;
				}
			}
			list_count.add(count);
		}
		int max = Collections.max(list_count);
		List<String> list_answer=new ArrayList<String>();
		if(max==0) {
			for(int i=0;list.size()>i;i++) {
				System.out.println(list.get(i));
			}
			System.exit(0);
		}
		for(int i=0;n-1>i;i++) {
			int count=0;
			if(list.get(i).equals(list.get(i+1))) {
				count++;
				i++;
				while(true) {
					if(i==n-1)
						break;
					if(!list.get(i).equals(list.get(i+1)))
						break;
					count++;
					i++;
				}
			}
			if(count==max)
				list_answer.add(list.get(i));
		}
		for(int i=0;list_answer.size()>i;i++) {
			System.out.println(list_answer.get(i));
		}
	}
}