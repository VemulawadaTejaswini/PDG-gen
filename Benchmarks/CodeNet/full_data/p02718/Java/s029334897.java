import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sn = new Scanner(System.in);
        
        int n = sn.nextInt();
        int m = sn.nextInt();
        int tmp = 0;
        int cnt = 0;
        int all = 0;
        double num = 0.0;
        double cal = 0.0;
        Integer[] array = new Integer[n];
        
        for(int i = 0; i < n; i++) {
            array[i] = sn.nextInt();
            all += array[i];
        }
        
        cal = (double) 1 / (4 * m);
        num = (double) (all * cal);
        for(int i = 0; i < n; i++) {
            if(array[i] > num){
                cnt++;
            }
        }
        
        if(cnt > m) {
            System.out.print("Yes");
            return;
        }
        
        System.out.print("No");
    }
}
