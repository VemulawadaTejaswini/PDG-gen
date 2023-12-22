import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//List<String> list=new ArrayList<String>(Arrays.asList(s.split("")));
		//List<Integer> list=new ArrayList<Integer>();
		//int[][] array = new int[3][3];
		int n = sc.nextInt();
		int m = sc.nextInt();
		List<Integer> list_answer=new ArrayList<Integer>();
		List<Integer> list_keta = new ArrayList<Integer>();
		List<Integer> list_su = new ArrayList<Integer>();
		for(int i=0;m>i;i++) {
			int s = sc.nextInt();
			int c = sc.nextInt();
			list_keta.add(s);
			list_su.add(c);
		}

		if(n==1) {
			for(int j=0;10>j;j++) {
				int count=0;
				String x = String.valueOf(j);
				List<String> list=new ArrayList<String>(Arrays.asList(x.split("")));
				for(int i=0;m>i;i++) {
					String y = String.valueOf(list_su.get(i));
					if(list.get(list_keta.get(i)-1).equals(y))
						count++;
				}
				if(count==m)
					list_answer.add(j);
			}
		}

		else if(n==2) {
			for(int j=10;100>j;j++) {
				int count=0;
				String x = String.valueOf(j);
				List<String> list=new ArrayList<String>(Arrays.asList(x.split("")));
				for(int i=0;m>i;i++) {
					String y = String.valueOf(list_su.get(i));
					if(list.get(list_keta.get(i)-1).equals(y))
						count++;
				}
				if(count==m)
					list_answer.add(j);
			}

		}

		else {
			for(int j=100;1000>j;j++) {
				int count=0;
				String x = String.valueOf(j);
				List<String> list=new ArrayList<String>(Arrays.asList(x.split("")));
				for(int i=0;m>i;i++) {
					String y = String.valueOf(list_su.get(i));
					if(list.get(list_keta.get(i)-1).equals(y))
						count++;
				}
				if(count==m)
					list_answer.add(j);
			}

		}

		if(list_answer.size()==0)
			System.out.println(-1);
		else
			System.out.println(Collections.min(list_answer));
	}
}