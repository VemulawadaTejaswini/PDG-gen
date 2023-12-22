import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        
        int W = sc.nextInt();
        int H = sc.nextInt();
        int d_x = sc.nextInt();
        int d_y = sc.nextInt();
        
        double ans_area = (W * H) / 2;
        
        if(d_x == W / 2 && d_y == H / 2){
            System.out.printf("%f 1", ans_area);
        }
        else{
            System.out.printf("%f 0", ans_area);
        }
    }
}
