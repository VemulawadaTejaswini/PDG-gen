import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int N1 = N/100;
        int N2 = (N - N1 * 100 ) /10;
        int N3 = (N - N1*100 - N2*10);
        if(N1==7||N2==7||N3==7) System.out.println("Yes");
        else System.out.println("No");
    }
}
