import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        sc.close();
        double res = Math.pow(l/3, 3);
        System.out.printf("%f", res);    
    }
}