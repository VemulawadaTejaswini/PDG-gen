import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long width = in.nextLong();
        long height = in.nextLong();
        long x = in.nextLong();
        long y = in.nextLong();
        in.close();
        
        boolean isHarf = width % 2 + height % 2 == 0;
        long area = width * height / 2;
        String ans1 = isHarf ? ".0" : ".5";
        String ans2 = width % 2 == 0 && height % 2 == 0 && width / x == 2 && height / 2 == 0 ? " 1" : " 0";
        System.out.println(String.valueOf(area) + ans1 + ans2);
    }
}
