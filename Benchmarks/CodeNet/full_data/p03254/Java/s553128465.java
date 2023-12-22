import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt();
        int k = 0;
        for(int i = 1;i <= n; i++){
            int u = sc.nextInt();
            x = x - u;
            k = k + 1;
        }
        System.out.println(k);
        System.out.println(n + " " + x + " ");
    }
}
