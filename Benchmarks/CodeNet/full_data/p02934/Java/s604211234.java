import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        double sum = 0;
        for(int i=0; i<n; i++){
            sum += 1/sc.nextDouble();
        }
        
        System.out.println(1/sum);
    }
}