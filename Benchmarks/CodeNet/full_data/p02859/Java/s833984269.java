import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        sc.close();

        int origin = 1 * 3;

        int thisTime = r * r * 3;

        int result = thisTime / origin;
        
        System.out.println(result);


    }
}
