import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int ans=0;
		if(b%a==0) {
			ans=a+b;
			System.out.println(ans);
		}else {
			ans=b-a;
			System.out.println(ans);
		}
	}

}
