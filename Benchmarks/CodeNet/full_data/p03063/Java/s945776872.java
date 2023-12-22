import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int number=sc.nextInt();

		String str = new String();

			str=sc.next();


		int count=0;
		int sum=0;
		int count2=0;


		//
			for(int z=0;z<number;z++) {

				count=0;
				count2=0;


					while(str.charAt(z)=='#') {
						count++;
						z++;
						if(z>=number) break;}

						if(z>=number) break;
					while(str.charAt(z)=='.' && count2<count) {
						count2++;
						sum++;
						z++;
						if(z>=number) break;
					}
					if(z<number) z--;

					//z--;



	}

		System.out.print(sum);}
}
