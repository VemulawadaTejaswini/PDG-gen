
import java.util.Scanner;

/**
 *
 * @author cs18097
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int lhigh = 0;
        int rlow = 1000000;
        int tmp;
        for(int i = 0;i < m;i++){
            tmp = sc.nextInt();
            if(lhigh < tmp)lhigh = tmp;
            tmp = sc.nextInt();
            if(rlow > tmp) rlow = tmp;
        }
        tmp = rlow-lhigh + 1;
        if(tmp < 0) tmp = 0;
        System.out.print(tmp);
    }
    
}
