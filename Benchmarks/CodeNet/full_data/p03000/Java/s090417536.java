import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        
        int n = t.nextInt();
        int x = t.nextInt();
        int d[] = new int[n+1];
        d[0] = 0;
        for (int i = 0; i < n; i++) {
            int y = t.nextInt();
            d[i+1] = d[i]+y;
        }
        int count = 0;
        for (int i = 0; i <= n; i++) {
            if (d[i] <= x){
                count++;
            }
        }
        System.out.println(count);
    }   
}