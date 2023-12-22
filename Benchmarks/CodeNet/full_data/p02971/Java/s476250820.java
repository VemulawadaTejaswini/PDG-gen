import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int[] value = new int[num];
        int a = 0;
        int b = 0;
        for (int i = 0; i < num; i++){
            value[i] = in.nextInt();
            if (a < value[i]) {
                b = a;
                a = value[i];
            } else if (b < value[i]) {
                b = value[i];
            }
        }
        in.close();
        for (int i = 0; i < num; i++) {
            if (a == value[i]) {
                System.out.println(b);
            } else {
                System.out.println(a);
            }
        }
    }
}
