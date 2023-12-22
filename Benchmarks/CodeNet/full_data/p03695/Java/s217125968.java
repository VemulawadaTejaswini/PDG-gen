import java.util.Scanner;


public class Main {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int a[] = new int [N+2];
		int over = 0;
		int c[] = new int [9];
		int max = 0;
		int min = 0;

		for (int i = 0  ; i <= N-1  ; i++){
		    a[i] = sc.nextInt();
		}

		for (int i = 0 ; i <= N-1 ; i++) {

			    if (a[i] <= 399) {
				c[0] = 1;
		   	}	else if (a[i] <= 799) {
				c[1]=1;
				} else if (a[i] <= 1199) {
					c[2]=1;
				}else if (a[i] <= 1599) {
					c[3]=1;
				}else if (a[i] <= 1999) {
					c[4]=1;
				}else if (a[i] <= 2399) {
					c[5]=1;
				}else if (a[i] <= 2799) {
					c[6]=1;
				}else if (a[i] <= 3199) {
					c[7]=1;
				}else {
					over = over + 1;
				}

			max = Math.min(8,c[0]+c[1]+c[2]+c[3]+c[4]+c[5]+c[6]+c[7]+over);
			min = Math.max(1, c[0]+c[1]+c[2]+c[3]+c[4]+c[5]+c[6]+c[7]);


		}

		System.out.print(min);
		System.out.print(" ");
		System.out.print(max);
	}

}
