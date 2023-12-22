import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Long R;
        Scanner sc = new Scanner(System.in);
        R = sc.nextLong();
        double Chu_vi =+R*2*Math.PI;
        //String.format("%.25g%n", Chu_vi);
        System.out.println(Chu_vi);

    }
}
