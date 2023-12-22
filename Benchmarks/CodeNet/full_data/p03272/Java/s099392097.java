import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int hoge = a.nextInt();
        Scanner b = new Scanner(System.in);
        int hoga = b.nextInt();
        System.out.println(hoge - hoga + 1);
    }
}
