import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		int a1=num/100;
		if(a1==1)
			num-=100;
		int a2=num/10;
		if(a2==1)
			num-=10;
		int a3=num/1;

		int sum=a1+a2+a3;
		System.out.println(sum);

		sc.close();
	}

}