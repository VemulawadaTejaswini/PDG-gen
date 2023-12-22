// "static void main" must be defined in a public class.
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int Y = scan.nextInt();
        for(int i = 0; i <= N; i++){
            for(int j = 0; j <= N; j++){
                if((i*10000 + j*5000 + (N-i-j)*1000) == Y && (N-i-j) >= 0){
                    System.out.println(i + " " + j + " " + (N-i-j));
                    return;
                }else if((N-i-j) < 0){
                    break;
                }
            }
        }
        System.out.println(-1 + " " + -1 + " " + -1);
    }
}