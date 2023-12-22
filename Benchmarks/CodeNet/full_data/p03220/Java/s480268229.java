import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//List<String> list= new ArrayList<String>(Arrays.asList(s.split("")));
		List<Double> list=new ArrayList<Double>();
		//Integer[] array = new Integer[m];
		int n = sc.nextInt();
		int t = sc.nextInt();
		int a = sc.nextInt();
		for(int i=0;n>i;i++) {
			int h = sc.nextInt();
			list.add(t-h*0.006);
		}
		//System.out.println(list);
		double answer = 10000;
		int count=0;
		for(int i=0;list.size()>i;i++) {
			double b = Math.abs(a-list.get(i));
			if(b<answer) {
				count=i+1;
				answer=b;
			}
		}
		System.out.println(count);
	}
}