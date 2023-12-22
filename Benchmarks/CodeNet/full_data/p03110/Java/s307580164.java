import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double s = 0.0, x;
        String u;
        for (int i = 0;i < n;i++){
            x = sc.nextDouble();
            u = sc.next();
            System.out.println(u);
            if(u.equals("JPY")){
                s += x;
            }else if (u.equals("BTC")){
                s += x * 380000.0;
            }
        }
        System.out.println(s);
    }
}
