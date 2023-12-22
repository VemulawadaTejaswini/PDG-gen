import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int m,d,sum = 0;
        
        m = sc.nextInt();
        d = sc.nextInt();
        
        for(int i = 4; i <= m; i++){
            for(int j = 22; j <= d; j++){
                if(i == (int)(j / 10) * (j % 10)) sum++;
            }
        }
        
        System.out.println(sum);
    }
}
