import java.util.*;
class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int keika =  b-a;

		if(b<=a){ //x<=b-a
			System.out.println("delicious");
		}else if(b<=a+x){
			System.out.println("safe");
		}else if(b>=a+x+1){
			System.out.println("dangerous");
		}
	}
}