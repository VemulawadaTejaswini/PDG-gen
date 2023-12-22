import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        boolean hantei = true;
        int num = 0;
        for(int i = 0; i < N; i++) {
            num = sc.nextInt();
            if(num % 2 == 1) {
                continue;
            }else if(num % 3 == 0 || num % 5 == 0) {
                continue;
            }else {
                hantei = false;
                break;
            }
            
        }
        if(hantei) {
            System.out.println("APPROVED");
        }else {
            System.out.println("DENIED");
        }
        
    }
}