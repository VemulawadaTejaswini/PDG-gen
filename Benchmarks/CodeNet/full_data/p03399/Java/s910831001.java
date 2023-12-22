import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt(),d=sc.nextInt();
		int ans=0;

		ans+=a>=b?b:a;
		ans+=c>=d?d:c;

		System.out.println(ans);

	}
}