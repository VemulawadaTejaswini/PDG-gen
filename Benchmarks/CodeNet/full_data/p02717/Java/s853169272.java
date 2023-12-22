import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sn = new Scanner(System.in);
        
        // 変数の宣言
        int x = 0;
        int y = 0;
        int z = 0;
        int tmp = 0;
        
        x = sn.nextInt();
        y = sn.nextInt();
        z = sn.nextInt();
        
        // ABを入れ替える
        tmp = x;
        x = y;
        y = tmp;
        
        // ACを入れ替える
        tmp = x;
        x = z;
        z = tmp;
        
        System.out.print(x + " " + y + " " + z);
    }
}
