import java.util.Scanner;


public class Main {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();


		int initilalAmari=a%b;
		int counter=0;

		while(true) {



			if(a%b==c) {
				System.out.println("YES");
				break;
			}



			if(counter>=1 && initilalAmari==a%b) {
				break;
			}

			counter++;

			a+=a;

		}

		sc.close();


	}


}

