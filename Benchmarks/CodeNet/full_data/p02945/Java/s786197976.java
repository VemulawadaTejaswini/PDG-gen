import java.util.Scanner;
public class Main {
	public static void main(String[] args) {


        // Scannerクラスのインスタンスの生成
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int p = a + b;
        int m = a - b;
        int t = a * b;
        int values[] = {p, m, t};//[1]
        int max      = values[0];//[2]

        for (int index = 1; index < values.length; index ++) {//[3]
            max = Math.max(max, values[index]);//[4]
        }
        System.out.println(max);

	}
}