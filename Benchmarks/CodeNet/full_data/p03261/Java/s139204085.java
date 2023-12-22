
import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input_values = sc.nextInt();
        String values[] = new String[input_values];
        values[0] = sc.next();
        for (int i = 1; i < input_values; i++) {
            
            values[i] = sc.next();
            for (int j = 0; j < i; j++) {
                if (values[j].equals(values[i])) {
                    System.out.println("No");
                    System.exit(0);
                }
            }
            if (values[i - 1].charAt(values[i - 1].length() - 1) != values[i].charAt(0)) {
                System.out.println("No");
                System.exit(0);
            }
        }
        System.out.println("Yes");

    }
}
