import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int R = sc.nextInt();
            int G = sc.nextInt();
            int B = sc.nextInt();
            int N = sc.nextInt();

            int counter = 0;
            for(int r = 0; r <= N / R; r++) {
                for(int g = 0; g <= N / G; g++) {
                    for(int b = 0; b <= N / B; b++) {
                        if(r * R + g * G + b * B == N) {
                            counter++;
                        }
                    }
                }
            }
            System.out.println(counter);

    }
}