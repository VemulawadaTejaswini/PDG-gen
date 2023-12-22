import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	// TODO 自動生成されたメソッド・スタブ
	Scanner sc = new Scanner(System.in);
	long n=sc.nextLong();
	long m=sc.nextLong();
	if(m%2==0)
		System.out.println((m/2)*n);
	if(m%2==1){
		System.out.println(((m/2)+1)*(n/2)+((m/2)+1)*(n%2)+((m/2)*(n/2)));
	}
	}

}