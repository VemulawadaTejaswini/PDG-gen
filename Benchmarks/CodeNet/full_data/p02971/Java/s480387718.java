import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//int a = sc.nextInt();
		//List<Integer> check=new ArrayList<Integer>();
		//array = new int[h+1][w+1];
		List<Integer> list=new ArrayList<Integer>();
		//List<String> list= new ArrayList<String>(Arrays.asList(s.split("")));
		//Collections.reverse(list);
		List<Integer> list_two=new ArrayList<Integer>();

		int n = sc.nextInt();

		for(int i=0;n>i;i++) {
			int a = sc.nextInt();
			list.add(a);
			list_two.add(a);
		}


		Collections.sort(list, Collections.reverseOrder());
		//System.out.println(list);
		//System.out.println(list_two);
		int list_in_max = Collections.max(list_two);
		int maxIndex = list_two.indexOf(Collections.max(list_two));
		//System.out.println(maxIndex);
		if(list.get(0).equals(list.get(1))) {
			for(int i=0;n>i;i++) {
				System.out.println(list_in_max);
			}
			System.exit(0);
		}

		else {
			for(int i=0;n>i;i++) {
				if(i==maxIndex) {
					list_two.remove(i);
					System.out.println(Collections.max(list_two));
				}
				else {
					System.out.println(list_in_max);
				}
			}

		}
		/*

		List<Integer> list_max=new ArrayList<Integer>();

		for(int i=0;n>i;i++) {
			int max =0;

			for(int j=0;n>j;j++) {
				if(i==j)
					continue;
				if(list.get(j)>max) {
					max = list.get(j);
				}

			}
			list_max.add(max);
		}

		for(int i=0;list_max.size()>i;i++) {
			System.out.println(list_max.get(i));
		}
		*/

	}

}
