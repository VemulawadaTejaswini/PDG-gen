import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] t = new int[n];
        int[] x = new int[n];
        int[] y = new int[n];
        for(int i=0; i<n; i++){
            t[i] = sc.nextInt();
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();   
        }

        int mx = 0;
        int my = 0;
        int mt = 0;

        for(int i=0; i<n; i++){
            int len = Math.abs(x[i] - mx) + Math.abs(y[i] - my);
            if(len <= t[i] - mt && len%2 == (t[i]-mt)%2){

            }else{
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}