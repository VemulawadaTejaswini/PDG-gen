import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        
        int H = in.nextInt();
        int W = in.nextInt();
        
        if (H == 1 || W == 1) {
            System.out.println(1);
        } else {
            System.out.println((H * W + 1) / 2);
        }
    }
}