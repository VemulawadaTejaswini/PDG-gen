
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max_h = 0;
        int result = 0;
        for(int i=0;i<n;i++){
            int tmp = sc.nextInt();
            if(tmp>=max_h){
                max_h = tmp;
                result++;
            }
        }

        System.out.println(result);
    }
}