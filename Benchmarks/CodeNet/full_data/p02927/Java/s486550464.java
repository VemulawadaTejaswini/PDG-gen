import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int d = sc.nextInt();

        int cnt = 0;

        int d10 = 0;
        int d1 = 0;

        for (int i = 1; i < m+1 ; i++) {
            for (int j = 1; j < d+1; j++) {
                d10 = j/10;
                d1 = j - d10*10;

                if( d1 * d10 == i && d10 >= 2 && d1 >=2 ){
                    cnt++;
                }
            }
        }

        System.out.println(cnt);
        sc.close();
    }
}