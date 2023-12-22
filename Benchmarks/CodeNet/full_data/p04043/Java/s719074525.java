import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int five = 0, seven = 0;
        for (int i = 0; i <3; i++){
            int x = in.nextInt();
            if (x == 5) five++;
            else if (x == 7)seven++;
        }
        if (five == 2 && seven == 1) System.out.println("YES");
        else System.out.println("NO");
    }
}