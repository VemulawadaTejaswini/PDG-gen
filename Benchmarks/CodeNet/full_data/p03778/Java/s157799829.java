import java.util.Scanner;
public class Sample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
	Scanner scan = new Scanner(System.in);
	int W = scan.nextInt();
	int a =scan.nextInt();
	int b = scan.nextInt();
	
	if(a+W<b){
		System.out.println((b-a-W));
	}else if (b+W<a){
		System.out.println((a-b-W));
	}else{
		System.out.println(0);
	}
 }
}