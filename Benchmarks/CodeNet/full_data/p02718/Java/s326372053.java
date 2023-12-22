import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//List<String> list=new ArrayList<String>(Arrays.asList(s.split("")));
		List<Integer> list=new ArrayList<Integer>();
		//int[] array = new int[2000000];
		int n = sc.nextInt();
		int m = sc.nextInt();
		int count=0;
		for(int i=0;n>i;i++) {
			int a = sc.nextInt();
			count=count+a;
			list.add(a);
		}
		//double saite = count/(4*m);
		int ko = 0;
		for(int i=0;n>i;i++) {
			if(list.get(i)*4*m>=count)
				ko++;
		}
		if(ko>=m)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}