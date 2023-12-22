import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        String line = scanner.nextLine();
        String[] inputs = line.split(" ");
        
        int x = Integer.parseInt(inputs[0]);
        int y = Integer.parseInt(inputs[1]);
        
        int max = Integer.MIN_VALUE;
        
        if (x + y > max) {
            max = x + y;
        }
        if (x - y > max) {
            max = x - y;
        }
        
        if (x * y > max) {
            max = x * y;
        }
        
        System.out.println(max);
        
        
    }
}
