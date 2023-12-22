import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        float L = stdIn.nextFloat();
        stdIn.close();
        L = L / 3;
        System.out.println(L*L*L);
    }
}
