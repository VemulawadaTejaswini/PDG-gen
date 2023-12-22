import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int D = sc.nextInt();
        int count = 0;
        for(int m = 4; m <= M; m++){
        for(int i = 2; i <= 3; i++){
            for(int j = 2; j <= 9; j++){
                if(i*j == m){
                    count++;
                }
            }
        }
        }
        System.out.println(count);
    }
}
