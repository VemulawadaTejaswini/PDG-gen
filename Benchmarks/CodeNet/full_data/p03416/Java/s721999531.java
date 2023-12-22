import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int A=sc.nextInt();
		int B=sc.nextInt();
		int cnt=0;
		for(int i=A;i<=B;i++) {
			if(i/10000==i%10 && (i%10000)/1000==(i%100)/10)cnt++;
		}
		System.out.println(cnt);
	}
}
