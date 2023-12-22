import java.util.Scanner;

/**
 * 增税
 */
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        double a = sc.nextInt();
        double b = sc.nextInt();

        double ad = (double)a;
        double bd = (double)b;

        for(int i = 0; i< 1009; i++){
            if (a == (int) Math.floor(i * 0.08)  && b == (int) Math.floor(i*0.1)){
                System.out.println(Math.floor(i*0.1));
            }
        }
        System.out.println("-1");

    }
}
