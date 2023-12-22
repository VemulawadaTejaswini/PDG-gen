import java.util.*;
import java.util.stream.*;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        if (Math.sqrt(a) + Math.sqrt(b) < Math.sqrt(c)){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}