import java.util.Scanner;
public class Main {
public static void main(String[]srgs) {
	Scanner scan=new Scanner(System.in);
	int a=scan.nextInt();
	int b=scan.nextInt();
	int c=scan.nextInt();
	int d=scan.nextInt();
	int ans=0;
	for(int i=0;i<=a;i++) {
		for(int j=0;j<=b;j++) {
			for(int k=0;k<=c;k++) {
				if((500*i+100*j+50*k)==d) {
					ans++;
				}
			}
		}
	}
	System.out.println(ans);
	scan.close();
}
}