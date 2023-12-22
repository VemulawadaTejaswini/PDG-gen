import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double resum = 0;
        for(int i = 0; i < N; i++) {
            resum += 1 / Double.parseDouble(sc.next());
        }
        
        System.out.println((double)(1 / resum));
    }
}