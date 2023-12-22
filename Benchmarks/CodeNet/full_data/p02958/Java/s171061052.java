import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int n = sc.nextInt();
		//String[][] array = new String[100][500];
		//List<String> list= new ArrayList<String>(Arrays.asList(s.split("")));
		List<Integer> list=new ArrayList<Integer>();
		List<Integer> list_up=new ArrayList<Integer>();
		int n = sc.nextInt();
		for(int i=0;n>i;i++) {
			int a=sc.nextInt();
			list.add(a);
			list_up.add(a);
		}

		Collections.sort(list_up);
		if(list.equals(list_up)) {
			System.out.println("YES");
			System.exit(0);
		}


		for(int i=0;(n*(n-1))/2>i;i++) {
			for(int j=i+1;n>j;j++) {
				int a = list.get(i);
				int b = list.get(j);
				list.set(i, b);
				list.set(j, a);
				if(list.equals(list_up)) {
					System.out.println("YES");
					System.exit(0);
				}
				else {
					list.set(i, a);
					list.set(j, b);
				}

			}
		}

		System.out.println("NO");
	}

}