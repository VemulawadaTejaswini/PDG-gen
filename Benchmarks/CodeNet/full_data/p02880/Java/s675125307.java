import java.util.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N;
		int idx = 0;
        N = sc.nextInt();

        for(int i = 1;i <= 9; i++) {
            for(int j = 1; j <= 9; j++) {
                if(i * j == N) {
                    idx++;
                    break;
                }
            }
        }
      
        if(idx > 0) {
          System.out.print("Yes");
        } else {
          System.out.print("No");
        }
 
        sc.close();

    }

}