import java.util.Scanner;

public class Main{

	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){

			int N = scan.nextInt();

			int[]a = new int[N];

			int count = 0;
			long goukei = 0;

			int num = 0;
			long co = 0;
			for(int i = 1;i<=N;i++) {
				goukei+=(long)i;
				if(goukei-N>=0) {
					co=goukei-N;
					num = i;
					count++;
					//System.out.println(co+" "+num+" "+count);
					break;
				}
			}

			if(co==0) {
				for(int i = 1;i<=num;i++) {
					System.out.println(i);
				}
			}else {
				for(int i = 1;i<=num;i++) {
					if(i==co)continue;
					System.out.println(i);

				}
			}

		}


	}



}
