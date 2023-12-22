import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int answer = 0;
        for (int i=1; i<=n; i++){
            if (keta(i) >= a && keta(i) <= b){
                answer += i;
            }
        }

        System.out.println(answer);
    }

    private static int keta(int a){
        int man = a / 10000;
        int amari = a % 10000;
        int sen = amari / 1000;
        amari = a % 1000;
        int hyaku = amari / 100;
        amari = amari % 100;
        int zyuu = amari / 10;
        amari = amari % 10;
        return man + sen + hyaku + zyuu + amari;
    }

}
