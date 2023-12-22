import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int b; 
        int p;
        if (b == X){
            System.out.println(1);
            return;
        }
        int max = 4;
        for (b = 2; b <= X; ++b){
            for (p = 2; p <= X; ++p){
                int max = (int) Math.pow(b,p); 
                if(expo > X) {
                    break;
                }
            }
        }
        
        //出力
        System.out.println(max);
    }
}