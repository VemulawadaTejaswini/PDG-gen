import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//int a = sc.nextInt();
		//List<Integer> check=new ArrayList<Integer>();
		//array = new int[h+1][w+1];
		List<Integer> list=new ArrayList<Integer>();
		//List<String> list= new ArrayList<String>(Arrays.asList(s.split("")));
		//Collections.reverse(list);

		int n = sc.nextInt();

		for(int i=0;n>i;i++) {
			int a = sc.nextInt();
			list.add(a);
		}

		if(n>3) {
			System.out.println("No");
			System.exit(0);
		}

		int count=0;

		if(list.get(0).equals(list.get(1)^list.get(2))) {
			count++;
		}

		if(list.get(1).equals(list.get(0)^list.get(2))) {
			count++;
		}

		if(list.get(2).equals(list.get(1)^list.get(0))) {
			count++;
		}

		if(count==3) {
			System.out.println("Yes");
		}

		else {
			System.out.println("No");
		}

/*
		int nann =1;

		for(int i=1;n>i;i++) {
			nann=nann*i;
		}

		//System.out.println(nann);

		//System.out.println(1^3);

		for(int i =0;nann>i;i++) {

		}
*/



	}

}
