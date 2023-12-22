import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        for(int i = 0; i <= 1250; i++){
            if((int) (i * 0.08) == a && (int) (i * 0.1) == b){
                System.out.println(i);
                System.exit(0);
            }
        }
        System.out.println(-1);
    }
}