import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);


		int n = sc.nextInt();
		int k = sc.nextInt();
		char d[] = new char[k];
		StringBuffer ans = new StringBuffer();


		String s;

		int flag =0;

		for (int i= 0; ;i++) {
			s = String.valueOf(n);
			flag =0;
			for(int j=0; j < k ;j++) {
			

			if(0 != s.lastIndexOf(d[j])){

			  flag = 1;
			  n+=1;
			}
			if(flag==0){break;}
		}

			System.out.println(n);



		
		sc.close();
	}
}
}