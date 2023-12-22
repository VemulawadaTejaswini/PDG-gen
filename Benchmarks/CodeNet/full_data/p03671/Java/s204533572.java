import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int max =0;

		if(getmax(a,b)==a){
			if (getmax(a,c)==a){
				max = a;
			}else{
				max = c;
			}

		}else{
			if (getmax(b,c)==b){
				max = b;
			}else{
				max = c;
			}
		}
		System.out.println(a+b+c-max);
	}

	public static int getmax(int n1,int n2){
		if(n1>n2){
			return n1;

		}else{
			return n2;
		}
	}
}