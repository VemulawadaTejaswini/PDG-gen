import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[] H = new int[N];
        
        for (int i = 0; i < N; i++) {
            
            H[i] = sc.nextInt();
        }
        
        int max = H[0];
        int canSee = 1;

        for (int i = 1; i < N; i++) {

            if (H[i] >= max) {

                canSee++;
                max = H[i];
            }
        }
        
        System.out.println(canSee);
        
        sc.close();
    }

}