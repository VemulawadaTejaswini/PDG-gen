import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt(); //町の数
        int T = scan.nextInt(); //売買するリンゴの最大数
        int[] a_i = new int[N];
        
        for(int i = 0; i < N; i++) a_i[i] = scan.nextInt();
        
        int maxRevenue = 0;
        int answer = 1;
        for(int i = 0; i < N; i++) {
            for(int j = i; j < N; j++) {
                int diff = a_i[i] - a_i[j];
                if(maxRevenue == diff) {
                    answer++;
                } else if(maxRevenue > diff) {
                    answer = 1;
                    maxRevenue = diff;
                }
            }
        }
        System.out.println(answer);
    }
}
