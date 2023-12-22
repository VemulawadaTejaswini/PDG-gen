import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();


int r[]=new int[6];

r[0]=ans(a,b,c);
r[1]=ans(a,c,b);
r[2]=ans(b,a,c);
r[3]=ans(b,c,a);
r[4]=ans(c,a,b);
r[5]=ans(c,b,a);

System.out.println(haimin(r));


	}

static int ans(int a,int b,int c){
	int ret=0;
	ret+=Math.abs(b-a);
	ret+=Math.abs(c-b);

	return ret;

}
public static int haimin(int a[]) {
	int d;
	d = a[0];
	for (int i = 0; i <= a.length - 1; i++) {
		if (d >= a[i]) {
			d = a[i];
		}

	}
	return d;
}

}