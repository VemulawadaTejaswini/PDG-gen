import java.util.Scanner;//入力を取得する(Scanner)

class Main {
	public static void main(String arts[]) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		int x, y , z;
		x = a + b ;
		y  = a - b;
		z = a * b;

		int ans1;
	if(x>=y){ 
		ans1 = x;
	}
	if(ans1 <= z){
		ans1 = z ;
	}
	System.out.println(ans1);
	}
}
