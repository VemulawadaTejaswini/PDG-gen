import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        int v[] = new int [n];
        for(int i = 0; i < n; i++)
            v[i] = scan.nextInt();
        int ans = -100000000;
        for(int a : v){
            for(int b:v){
                ans = Math.max(ans,Math.abs(a-b));
            }
        }
        System.out.println(ans);
    }
}
