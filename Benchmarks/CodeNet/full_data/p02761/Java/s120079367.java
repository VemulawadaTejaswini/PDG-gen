import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] z = new int[N];

        for (int i = 0; i < M; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            if ((z[a-1] != 0 && z[a-1] != b) || (N >= 2 && a == 1 && b == 0)){
                System.out.println(-1);
                return;
            }
            z[a-1] = b;
        }

        if (N >= 2 && z[0] == 0){
            z[0] = 1;
        }

        for (int i = 0; i < z.length; i++){
            System.out.print(z[i]);
        }

    }
}