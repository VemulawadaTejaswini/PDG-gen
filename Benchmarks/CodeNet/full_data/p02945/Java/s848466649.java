import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        int AtasuB = A + B;
        int AhikuB = A - B;
        int AkakeruB = A * B;

        if (AtasuB < AhikuB) {
            if (AhikuB < AkakeruB) {
                System.out.println(AkakeruB);
                return;
            } else {
                System.out.println(AhikuB);
                return;
            }
        } else {
            if (AtasuB < AkakeruB) {
                System.out.println(AkakeruB);
                return;
            } else {
                System.out.println(AtasuB);
                return;
            }
        }
    }
}
