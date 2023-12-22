import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int L = sc.nextInt();
        int R = sc.nextInt();

        sc.close();
        
        int min = 2019;

        for(int i = L; i <= R-1; i++){
            for(int j= i+1; j <= R; j++){
                int tmp = i*j%2019;
                min = Math.min(tmp, min);
            }
        }
        System.out.println(min);
    }
}