import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        double k = input.nextDouble();
        if (k <= (Math.ceil(n/2.0))){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}