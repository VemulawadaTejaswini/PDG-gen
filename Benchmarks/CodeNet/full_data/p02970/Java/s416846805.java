
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int D = scanner.nextInt();

        int tmpD = 2 * D + 1;

        if(N % tmpD == 0){
            System.out.println(N/tmpD);
        }else{
            System.out.println(N/tmpD + 1);
        }

    }
}
