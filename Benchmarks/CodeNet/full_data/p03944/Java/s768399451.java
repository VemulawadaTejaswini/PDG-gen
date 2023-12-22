import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int w = scan.nextInt();
		int h = scan.nextInt();
		int n = scan.nextInt();
		int x[]=new int[n];
		int y[]=new int[n];
		int a[]=new int[n];

		int check_x[]=new int[w];
		int check_y[]=new int[h];
		for(int i=0;i<n;i++) {
			x[i]=scan.nextInt();
			y[i]=scan.nextInt();
			a[i]=scan.nextInt();
		}

		scan.close();
		for(int i=0;i<w;i++) {
			check_x[i]=0;
		}
		for(int i=0;i<h;i++) {
			check_y[i]=0;
		}
		int white_w=w;
		int white_h=h;
		for(int i=0;i<n;i++) {
			switch(a[i]) {
			case 1:
				if(check_x[x[i]-1]==0) {
					white_w-=x[i];
					check_x[x[i]-1]=1;
				}
				break;
			case 2:
				if(check_x[x[i]-1]==0) {
					white_w-=(w-x[i]);
					check_x[x[i]-1]=1;
				}
				break;
			case 3:
				if(check_y[y[i]-1]==0) {
					white_h-=y[i];
					check_y[y[i]-1]=1;
				}
				break;
			case 4:
				if(check_y[y[i]-1]==0) {
					white_h-=(h-y[i]);
					check_y[y[i]-1]=1;
				}
				break;
			}
		}
		System.out.println((white_w*white_h>0)? white_w*white_h : "0");
	}
}