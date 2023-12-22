import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        
        int L = sc.nextInt();
        int R = sc.nextInt();

        int min = Integer.MAX_VALUE;
        for(int i = L; i < R; i++){
            for(int j = L+1; j <= R; j++){
                min = Math.min(min,(i * j) % 2019);
            }
        }
        System.out.println(min);
    }
}
