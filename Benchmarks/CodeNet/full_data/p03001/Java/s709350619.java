import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int w = s.nextInt();
        int h = s.nextInt();
        int x = s.nextInt();
        int y = s.nextInt();
        System.out.println((double)(w*h/2)+" "+((x==w/2&&y==h/2) ? "1":"0"));
    }
}