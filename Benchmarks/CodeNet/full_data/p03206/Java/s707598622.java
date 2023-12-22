import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        
        String result = "Christmas";
        for (int i=0; i<25%d; i++) {
            if (25%d != 0) {
                result = result.concat(" Eve");
            }
        }

        System.out.println(result);
    }
}
