import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//List<String> list= new ArrayList<String>(Arrays.asList(s.split("")));
		//List<Integer> list_gold=new ArrayList<Integer>();
		//Integer[] Republican = new Integer[m];
		//List<Integer> list=new ArrayList<Integer>();
		List<Integer> list=new ArrayList<Integer>();
		List<Integer> list_up=new ArrayList<Integer>();

		int n = sc.nextInt();
		int k = sc.nextInt();

		for(int i=0;n>i;i++) {
			int a = sc.nextInt();
			list.add(a);
			list_up.add(a);
		}

		Collections.sort(list_up);
		int count=0;

		for(int i=0;n>i;i++) {
			if(!list.get(i).equals(list_up.get(i))) {
				count++;
			}
			if(n-i>=k) {
				for(int j=0;k>j;j++) {
					if(list.get(i+j).equals(list_up.get(i+j))) {
						break;
					}
					if(j==k-1) {
						count--;
					}
				}
			}
		}
		if(count==0) {
			System.out.println(1);
		}

		else {
			System.out.println(count);
		}


	}

}