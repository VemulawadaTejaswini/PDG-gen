import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a, b, c, x;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        x = sc.nextInt();

        int ans = 0;
        int t = 0;

        for(int i = 0; i <= a; i++){
            for(int j = 0; j <= b; j++){
                t = (x - (500*i + 100*j)) / 50;
                if(t >= 0 && t <= c) ans++;
            }
        }

        System.out.println(ans);

        sc.close();
    }
}