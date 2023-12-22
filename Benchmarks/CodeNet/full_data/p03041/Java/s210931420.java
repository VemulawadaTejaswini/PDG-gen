import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String c = sc.next();
        String[] d = c.split("");
        String e = c.substring(b - 1, b).toLowerCase();
        d[b - 1] = e;
        for (int i = 0; i < a; i++) {
            System.out.println(d[i]);
        }
    }

}
