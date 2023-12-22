import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] Arguments) throws IOException 
    {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextInt(), B = sc.nextInt(), C = sc.nextInt(), X = sc.nextInt(), Y = sc.nextInt();
        
        // Cost of Buying A and B Pizzas separately:
        long costAB = A * X + B * Y;
        
        // Common Number of A and B Pizzas
        long Same = Math.min(X, Y);
        X = X - Same; 
        Y = Y - Same;
        long costCombine = Same * 2 * C + A * X + B * Y;
        long totalCost = Same * 2 * C + Math.max(X, Y) * 2 * C;
        
        // Is it better to buy A and B Pizzas Seperately, or should he use AB Pizzas?
        long Best = Math.min(costAB, costCombine);
        Best = Math.min(Best, totalCost);
        System.out.println(Best);
    }
}