import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int count = n/(a+b);
		int rest = n%(a+b);
		int blue = 0;
		if(rest <= a){
			blue = a * count + (rest);
		}else {
			blue = a * (count + 1);
		}
		System.out.println(blue);
	}
}