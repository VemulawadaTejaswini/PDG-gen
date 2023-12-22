import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//List<String> list= new ArrayList<String>(Arrays.asList(s.split("")));
		//List<Integer> list=new ArrayList<Integer>();
		//Integer[] array = new Integer[m];
		int n= sc.nextInt();
		int answer = 0;
		List<Integer> list=new ArrayList<Integer>();
		for(int i=0;n-1>i;i++) {
			int a = sc.nextInt();
			list.add(a);
		}
		answer = list.get(0);
		for(int i=0;n-2>i;i++) {
			int a = list.get(i);
			int b = list.get(i+1);
			if(a<b)
				answer = answer+a;
			else
				answer = answer+b;
		}
		answer = answer+list.get(n-2);
		System.out.println(answer);
	}
}