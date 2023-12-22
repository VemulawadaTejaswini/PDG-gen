import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int N = sc.nextInt();
        int waza;
        boolean hantei = false;
        for(int i = 0; i < N; i++) {
            waza = sc.nextInt();
            H -= waza;
            if(H <= 0) {
                hantei = true;
            }
        }
        
        if(hantei) {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
        
        

    }
}
