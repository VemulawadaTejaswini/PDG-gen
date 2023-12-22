import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		Long n = sc.nextLong();
		Long a = sc.nextLong();
		Long b = sc.nextLong();
		Long count =n/(a+b)*a;
		if(n%(a+b)>a) {
			count = count +a;
		} else {
			count = count+n%(a+b);
		}
		System.out.println(count);

	}
}
