import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        
        int n = stdIn.nextInt();
        double num[] = new double[n];
        double sum = 0;
        
        for(int i = 0; i < n; i++){
            num[i] = stdIn.nextDouble();
            sum += 1 / num[i];
        }
        
        System.out.println(1 / sum);
    }
}
