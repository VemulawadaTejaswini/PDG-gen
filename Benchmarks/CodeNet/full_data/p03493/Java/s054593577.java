import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int s1 = a.nextInt();
        if (s1 - 111 == 0) {
            System.out.print("111");
        }
        if (s1 - 110 == 0) {
            System.out.print("11");
        }
        if (s1 - 101 == 0) {
            System.out.print("11");
        }
        if (s1 - 100 == 0) {
            System.out.print("1");
        }
        if (s1 - 011 == 0) {
            System.out.print("11");
        }
        if (s1 - 010 == 0) {
            System.out.print("1");
        }
        if (s1 - 001 == 0) {
            System.out.print("1");
        }
        a.close();
    }
}
