import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//String[][] array = new String[8][8];
		//List<String> list= new ArrayList<String>(Arrays.asList(s.split("")));
		List<Integer> list=new ArrayList<Integer>();
		int n = sc.nextInt();
		int k = sc.nextInt();
		int q = sc.nextInt();
		for(int i=0;n>i;i++) {
			list.add(k);
		}
		for(int i=0;q>i;i++) {
			int a = sc.nextInt();
			for(int j=0;n>j;j++) {
				if(a-1==j)
					continue;
				list.set(j, list.get(j)-1);
			}
			//System.out.println(list);
		}

		for(int i=0;n>i;i++) {
			if(list.get(i)>0)
				System.out.println("Yes");
			else {
				System.out.println("No");
			}
		}

		//System.out.println(list);
	}

}