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

		if(n>4) {
			System.out.println("No");
			System.exit(0);
		}

		if(n==3) {
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
				System.exit(0);
			}

			else {
				System.out.println("No");
				System.exit(0);
			}
		}

		if(n==4) {
			for(int i=0;3>i;i++) {
				int count=0;
				if(i==0) {
					if(list.get(0).equals(list.get(1)^list.get(3))) {
						count++;
					}

					if(list.get(1).equals(list.get(0)^list.get(2))) {
						count++;
					}

					if(list.get(2).equals(list.get(1)^list.get(3))) {
						count++;
					}

					if(list.get(3).equals(list.get(0)^list.get(2))) {
						count++;
					}

					if(count==4) {
						System.out.println("Yes");
						System.exit(0);
					}
				}

				if(i==1) {
					if(list.get(0).equals(list.get(2)^list.get(3))) {
						count++;
					}

					if(list.get(2).equals(list.get(0)^list.get(1))) {
						count++;
					}

					if(list.get(1).equals(list.get(2)^list.get(3))) {
						count++;
					}

					if(list.get(3).equals(list.get(0)^list.get(1))) {
						count++;
					}

					if(count==4) {
						System.out.println("Yes");
						System.exit(0);
					}
				}

				if(i==2) {
					if(list.get(0).equals(list.get(1)^list.get(2))) {
						count++;
					}

					if(list.get(1).equals(list.get(3)^list.get(0))) {
						count++;
					}

					if(list.get(3).equals(list.get(1)^list.get(2))) {
						count++;
					}

					if(list.get(2).equals(list.get(0)^list.get(3))) {
						count++;
					}

					if(count==4) {
						System.out.println("Yes");
						System.exit(0);
					}
				}


			}
		}

		System.out.println("No");


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
