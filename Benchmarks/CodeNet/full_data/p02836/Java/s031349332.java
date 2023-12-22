import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String[] b = a.split("");
        int count = 0;
        if (b.length % 2 == 0) {
            for (int i = 0; i < b.length / 2; i++) {
                if (!(b[i].equals(b[b.length - 1 - i]))) {
                    count++;
                }
            }
        }
        if (b.length % 2 == 1) {
            for (int i = 0; i < (b.length-1) / 2; i++) {
                if (!(b[i].equals(b[b.length - 1 - i]))) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
