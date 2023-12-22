import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		char ch[] = sc.next().toCharArray();
		List<List<Integer>> list = new ArrayList<>();
		for (int i=0;i<26;i++) {
			List<Integer> intList = new ArrayList<>();
			list.add(intList);
		}
		for (int i=0;i<N;i++) {
			int index= ch[i]-'a';
			List l= list.get(index);
			l.add(i+1);
		}
		int Q = sc.nextInt();
		for (int i=0;i<Q;i++) {
			int a = sc.nextInt();
			if (a==1) {
				Integer position = sc.nextInt();
				char c= sc.next().charAt(0);
				if (ch[position-1] != c) {
					list.get(ch[position-1]-'a').remove(position);
					ch[position-1] = c;
					list.remove(position);
					Main.add(list.get(c-'a'), position);
				}
			} else {
				int start = sc.nextInt();
				int end = sc.nextInt();
				int count =0;
				for(int j=0;j<26;j++) {
					List<Integer> intList = list.get(j);
					if (Main.find(intList, start, end)==true) {
						count++;
					}
				}
				System.out.println(count);
			}
		}
	}

	public static void add(List<Integer> list,int position) {
		int start =0;
		int end = list.size()-1;
		int result =0;
		int temp = (start+end)/2;
		while (end>=start) {
			if (position>list.get(temp)) {
				start = temp+1;
				result = temp;
			} else {
				end = temp-1;
			}
		}
		list.add(result,position);
	}
	public static boolean find(List<Integer> list,int min ,int max) {
		int start =0;
		int end = list.size()-1;
		if (end<0) {
			return false;
		}
		if (list.get(start)>max&&list.get(end)<min) {
			return false;
		}
		int temp = (start+end)/2;
		while (end >=start) {
			if (list.get(temp)>max) {
				end = temp-1;
			} else if(list.get(temp)<min) {
				start = temp+1;
			} else {
				return true;
			}
			temp = (start+end)/2;
		}
		return false;
	}
}