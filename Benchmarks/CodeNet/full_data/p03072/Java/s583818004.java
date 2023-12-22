import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//List<String> list= new ArrayList<String>(Arrays.asList(s.split("")));
		//List<Integer> list=new ArrayList<Integer>();
		//Integer[] Republican = new Integer[m];
		int n = sc.nextInt();
		List<Integer> list=new ArrayList<Integer>();
		for(int i=0;n>i;i++) {
			int a = sc.nextInt();
			list.add(a);
		}
		int count=1;
		int max=list.get(0);
		for(int i=0;n-1>i;i++) {
			if(list.get(i+1)>max)
				max=list.get(i+1);
			if(list.get(i)<=list.get(i+1)) {
				if(list.get(i+1)>=max)
					count++;
			}
			//System.out.println(max);
		}

		System.out.println(count);
	}
}

