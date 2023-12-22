import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        
        boolean hantei = true;
        int i = 1;
        while(hantei) {
            if(N < Math.pow(K, i)) {
                System.out.println(i);
                hantei = false;
            }
            i++;
        }
    }
}