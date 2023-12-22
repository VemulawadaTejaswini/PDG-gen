import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//List<String> list= new ArrayList<String>(Arrays.asList(s.split("")));
		//List<Integer> list=new ArrayList<Integer>();
		//Integer[] array = new Integer[m];
		int n = sc.nextInt();
		List<Integer> list=new ArrayList<Integer>();
		for(int i=0;n>i;i++) {
			int a = sc.nextInt();
			list.add(a);
		}
		for(int i=1;n+1>i;i++) {
			for(int j=0;n>j;j++) {
				if(list.get(j).equals(i)) {
					System.out.print(j+1);
					break;
				}
			}
			if(i!=n)
				System.out.print(" ");
		}
	}
}