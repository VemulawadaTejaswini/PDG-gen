import java.util.*;
 
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 調査対象
		int A = sc.nextInt(); // A の購読者数
		int B = sc.nextInt(); // B の購読者数

        int max = Math.min(A, B);
		int min = A + B < N ? 0 : A + B - N;
		
        System.out.println(max + " " + min);
	}
}