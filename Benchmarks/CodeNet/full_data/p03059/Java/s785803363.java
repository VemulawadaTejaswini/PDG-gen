import java.util.*;

class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        int T = sc.nextInt();

        int times = T / A;

        System.out.println(times*B);
    }
}
