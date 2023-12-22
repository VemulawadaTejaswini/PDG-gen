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
		int max=0;
		for(int i=0;n>i;i++) {
			int a = sc.nextInt();
			list.add(a);
		}
		for(int i=0;n-1>i;i++) {
			for(int j=i+1;n>j;j++) {
				int b = Math.abs(list.get(i)-list.get(j));
				if(b>max)
					max=b;
			}
		}
		System.out.println(max);
	}
}