import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;
        for (int ct = a; ct <= b; ct++) {
            if (((ct + "").charAt(0)) == ((ct + "").charAt(4))) {
                if (((ct + "").charAt(1)) == ((ct + "").charAt(3))) {
                    sum++;
                }
            }
        }
        System.out.println(sum);
    }
}