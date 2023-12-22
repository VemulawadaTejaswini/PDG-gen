import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long i = 2;
        long j = 2;
        long s = 0;
        long t = 1;
        while (s != t) {
            if (s < t) {
                s = a * i;
                i++;
            } else {
                t = b * j;
                j++;
            }
        }
        System.out.println(s);
        System.out.println(t);
    }
}
