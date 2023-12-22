import java.util.Scanner;
class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int t = sc.nextInt();
		for(int i = 0; i < t ; i++){
			X --;
		}
		System.out.println(X);
	}
}