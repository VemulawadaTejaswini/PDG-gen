import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        //N円の税抜き価格X円を知りたい！！
        //値段
        int n = sc.nextInt();
        
        for(double i = 1;i < n;i++){
            if((int)(i * 1.08) == n){
                System.out.println((int)i);
                return;
            }
        }
        
        System.out.println(":(");
    }
}
