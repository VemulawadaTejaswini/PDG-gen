
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int r = 0;
                int b = 0;
                for (int i = 0 ; i< s.length(); i++) {
                    if (s.substring(i, i + 1).equals("R")) {
                        r++;
                    } else {
                        b++;
                    }
                }
                
                if (r > b) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
                    
    }

}
