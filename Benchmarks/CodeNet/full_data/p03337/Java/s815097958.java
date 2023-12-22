import java.util.Scanner;

class Main(){
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int res1 = a + b;
		int res2 = a - b;
		int res3 = a * b;
		
		int max_num1 = Math.max(res1, res2);
		int max_num2 = Math.max(max_num1, res3);
		
		System.out.println(max_num2);
	}
}