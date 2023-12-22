import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        boolean divisible = false;

        for(int i = 9; i > 1; i--) {
            double divided = N/i;
            int count = 0;
            if(N%1 == 0 && divided != i) {
                count++;
                if(count == 2)
                  divisible = true;
            }
        }

        if(divisible) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
}

    }
}