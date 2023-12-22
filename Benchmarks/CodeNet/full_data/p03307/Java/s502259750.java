import java.util.Scanner;
class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), i = 2;
		while(true){
			if(i%n==0){
				break;
			}
			i+=2;
		}
		System.out.println(i);
	}
}