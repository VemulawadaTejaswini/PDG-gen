import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        // 複数行の読み込み
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        if ((a * b) % 2 == 0) {
        	System.out.println("Even");
        } else {
        	System.out.println("Odd");
        }
    }
}