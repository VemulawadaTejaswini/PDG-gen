import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        // 複数行の読み込み
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int mod = (int) ((c+0.5) / a);
        
        System.out.println(mod*b);
    }
}