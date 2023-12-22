import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main  {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		//int n = sc.nextInt();
		//int k = sc.nextInt();
		//String[] array = new String[h+1];
		List<String> list= new ArrayList<String>(Arrays.asList(s.split("")));
		//List<Integer> list=new ArrayList<Integer>();

		String x="";
		String y="";
		int count1=0;
		int count2=0;

		for(int i=0;4>i;i++) {
			if(i==0) {
			x=list.get(i);
			}
			else {
				if(x.equals(list.get(i))) {
					count1++;
				}
				else if(y.equals(list.get(i))) {
					count2++;
				}
				else {
					y=list.get(i);
				}
			}
			//System.out.println(x);
			//System.out.println(y);
		}
		if(count1==1&&count2==1) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}

		}

}

