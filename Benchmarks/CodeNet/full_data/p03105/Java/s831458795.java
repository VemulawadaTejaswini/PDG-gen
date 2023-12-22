import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int result = 0;
        if(A * C <= B) {
        	result = C;
        }
        else {
        	result = B / A;
        }
        System.out.println(result);
	}
}
