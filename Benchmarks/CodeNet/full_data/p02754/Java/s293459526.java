import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Long N, A, B;
        Scanner sc = new Scanner(System.in);
        N = sc.nextLong();
        A = sc.nextLong();
        B = sc.nextLong();
        Long N_du = N%(A+B);
        System.out.println(A + (N_du >= A ? A : N_du) * (N/(A+B)));
    }
}
