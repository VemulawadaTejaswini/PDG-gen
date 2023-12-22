import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        
        int A = X/500;
        int B = (X%500)/5;
        
        System.out.println(1000*A+5*B);
    }
}
