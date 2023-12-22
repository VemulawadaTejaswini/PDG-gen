import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        //値の取得
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        
        long count = 0;
        long max = 0;   //最大平方数
        
        while (true){
            if (count * count >= N){
                System.out.println(max);
                break;
            } else {
                max = count * count;
            }
            ++count;
        }

    }
}