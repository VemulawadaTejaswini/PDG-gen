import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int n = sc.nextInt();
		//String[][] array = new String[100][500];
		//List<String> list= new ArrayList<String>(Arrays.asList(s.split("")));
		List<Integer> list_origin=new ArrayList<Integer>();
		List<Integer> list_last=new ArrayList<Integer>();
		int n = sc.nextInt();
		int k = sc.nextInt();

		for(int i=0;n>i;i++) {
			int a = sc.nextInt();
			list_origin.add(a);
		}

		for(int i=0;k>i;i++) {
			for(int j=0;list_origin.size()>j;j++) {
				list_last.add(list_origin.get(j));
			}
		}

		int count=0;

		for(int i=0;n*k>i;i++) {
			int a = list_last.get(0);
			//System.out.println(list_last);
			for(int j=1;list_last.size()>j;j++) {
				if(a>list_last.get(j)) {
					//System.out.println(a);
					count++;
				}
			}
			list_last.remove(0);
		}

		//System.out.println(count);

		double answer = count%(Math.pow(10, 9)+7);
		System.out.println((int)answer);



	}

}