import java.util.Scanner;

import javax.sql.rowset.serial.SerialArray;

public class Main {

		public static void main(String[] args){
			
			Scanner sc = new Scanner(System.in);

			int N = sc.nextInt();
			int Z = sc.nextInt();
			int W = sc.nextInt();

			if (N == 1){
				int a = sc.nextInt();
				if(Z < a){
					Z = a;
				}
				int ans = Z - W;
				System.out.println(ans);
				return;
			}
			for (int i = 1 ; i <=  N ; i++){
				int a = sc.nextInt();
				if(i != N ){
					if(Z <= a){
						Z = a;
					}else{
						if(i != 1){
							if(W > a){
								W = a;
							}
						}
					}
				}
			}

			int ans = Z - W;
			if(ans < 0){
				ans = ans * -1;
			}
			System.out.println(Z);
			System.out.println(W);
			System.out.println(ans);
		}
}
