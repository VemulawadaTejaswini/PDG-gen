import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//List<String> list=new ArrayList<String>(Arrays.asList(s.split("")));
		List<Integer> list=new ArrayList<Integer>();
		//int[] array_k = new int[100000];
		List<Integer> list_2=new ArrayList<Integer>();
		int n = sc.nextInt();
		int k = sc.nextInt();
		int count = 0;
		if(k%2==1) {
			for(int i=1;n+1>i;i++) {
				if(i%k == 0) {
					list.add(i);
				}
			}
			//System.out.println(list);
			System.out.println(list.size()*list.size()*list.size());
		}
		else {
			for(int i=1;n+1>i;i++) {
				if(i%k == 0) {
					list.add(i);
				}
				if(i%k == k/2) {
					list_2.add(i);
				}
			}
			//System.out.println(list);
			System.out.println(list.size()*list.size()*list.size()+
					list_2.size()*list_2.size()*list_2.size());
		}
	}
}