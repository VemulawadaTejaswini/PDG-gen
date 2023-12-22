import java.util.Scanner;
public class Main {
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	int d[] = new int[b];
	int e[] = new int[a];
	int f = 0;
	for(int m=0;m<b;m++ ) {
		d[m] = sc.nextInt();
	}
	for(int n=0;n<a;n++ ) {
		e[n] = 0;
		for(int m=0;m<b;m++ ) {
			e[n] =e[n] +sc.nextInt() *d[m];
		}
		e[n] = e[n] + c;
		if (e[n] > 0)
			f++;
	}
	System.out.println(f);
	sc.close();
}
}