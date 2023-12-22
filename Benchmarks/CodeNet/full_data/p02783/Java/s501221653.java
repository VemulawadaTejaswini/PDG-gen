import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int a = sc.nextInt();
        int counter = 0;
        counter = h / a;
        if (h % a != 0) {
            counter++;
        }
        System.out.println(counter);
        sc.close();
    }
}