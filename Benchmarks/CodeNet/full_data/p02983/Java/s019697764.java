import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        long L = scanner.nextInt();
        long R = scanner.nextInt();
        if(R - L >= 2019){
            System.out.println(0);
        }
        else {
            int min = 2019;
            for(long i = L; i <= R; i++){
                for(long j = i + 1; j <= R; j++){
                    long t = (i * j)%2019;
                    min = (int) Math.min(min, t);
                }
            }
            System.out.println(min);
        }

    }

}
