import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		for(int hi=0;hi<h;hi++) {
			for(int wi=0;wi<w;wi++) {
				int p = 0;
				if(hi<b) {p++;}
				if(wi<a) {p++;}
				System.out.print(p%2 + " ");
				if(wi==w-1) {
					System.out.println("");
				}else {
					System.out.print(" ");
				}
			}
		}

	}

}
