import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner scan = new Scanner(System.in);
        int w = Integer.parseInt(scan.next());
        int h = Integer.parseInt(scan.next());
        int x = Integer.parseInt(scan.next());
        int y = Integer.parseInt(scan.next());
        
        float cW = w/2;
        float cH = h/2;
        int a;
        if(((float)x == cW && (float)y == cH)|| ((float)x == cH && (float)y == cW)){
            a = 1;
        }else{
            a = 0;
        }
        
        System.out.println(w * h / 2.0 + " " + a);
        //最大値は恐らく長方形の面積の半分。
    }
}
