public class Main {
	public static void main(String[] args){
		//1<=r,g,b<=9
		int r = new java.util.Scanner(System.in).nextInt();
		int g = new java.util.Scanner(System.in).nextInt();
		int b = new java.util.Scanner(System.in).nextInt();
		if (r<1 || r>9 || b<1 || b>9 || g<1 || g>9){
			System.out.println("入力可能な数字は1~9です");
		} else {
			int num = 100*r + 10*g + b;
			if (num%4==0){
				System.out.println("Yes");
			} else{
				System.out.println("No");
			}
		}

	}
}
