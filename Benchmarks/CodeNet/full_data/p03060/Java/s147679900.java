import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//List<String> list= new ArrayList<String>(Arrays.asList(s.split("")));
		//List<Integer> list_gold=new ArrayList<Integer>();
		//Integer[] Republican = new Integer[m];
		int n = sc.nextInt();
		List<Integer> list_kati=new ArrayList<Integer>();
		List<Integer> list_cost=new ArrayList<Integer>();
		int count=0;
		for(int i=0;n>i;i++) {
			int a = sc.nextInt();
			list_kati.add(a);
		}

		for(int i=0;n>i;i++) {
			int a = sc.nextInt();
			list_cost.add(a);
		}

		for(int i=0;n>i;i++) {
			if(list_kati.get(i)>list_cost.get(i))
				count=count+list_kati.get(i)-list_cost.get(i);
		}

		System.out.println(count);

	}
}

