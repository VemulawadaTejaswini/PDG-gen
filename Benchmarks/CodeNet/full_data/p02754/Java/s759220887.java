import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int t = a + b;

        int syou = n/t;
        //System.out.println(syou);

        int amari = n%t;
        //System.out.println(amari);

        int nokori = a;
        // 7  1
        if(amari < a){
            nokori = amari;
        }
        int ans = a*syou + nokori;
        System.out.println(ans);

    }

}
