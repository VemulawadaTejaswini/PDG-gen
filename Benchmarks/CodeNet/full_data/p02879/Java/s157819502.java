import java.util.Scanner;

public class b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        if (a>10 || b>9){
            System.out.println("-1");
        }else System.out.println(a*b);
    }
}