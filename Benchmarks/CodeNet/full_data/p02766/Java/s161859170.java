import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        
        int d = 0;
        
        for(d = 0; d < 100; d++) {
            if(Math.pow(k,d) > n) {
                break;
            }
        }
        
        System.out.println(d);
    }
}