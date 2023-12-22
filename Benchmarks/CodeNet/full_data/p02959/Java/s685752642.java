import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            int[] enemys = new int[n + 1];
            for(int i = 0;i<(n + 1);i++){
                enemys[i] = sc.nextInt();
            }
            int[] heros = new int[n];
            for(int i = 0;i<n;i++){
                heros[i] = sc.nextInt();
            }
            int sum = 0;
            for(int i= 0; i < heros.length; i++) {
                int atack = heros[i];
                //1番目
                //倒せる
                if (atack >= enemys[i]) {
                    sum += enemys[i];
                    atack -= enemys[i];
                    enemys[i] = 0;
                    //倒せない
                } else {
                    sum += atack;
                    enemys[i] -= atack;
                    atack = 0;
                }

                //2番目
                if (atack >= enemys[i + 1]) {
                    sum += enemys[i + 1];
                    atack -= enemys[i + 1];
                    enemys[i + 1] = 0;
                    //倒せない
                } else {
                    sum += atack;
                    enemys[i + 1] -= atack;
                    atack = 0;
                }
            }
            System.out.println(sum);

        }
    }
}
