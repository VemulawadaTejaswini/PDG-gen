
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
        int ans = 0;
        int high = 0;
        int[] poyo = new int[n];
        poyo[0] = sc.nextInt();
        for(int i = 1;i < n;i++){
            int tmp = sc.nextInt();
            if(poyo[i-1] >tmp)poyo[i-1]--;
            poyo[i] = tmp;
        }
        for(int i = 1;i< n;i++){
            if(poyo[i-1] > poyo[i]){
                System.out.print("No");
                return;
            }
        }
        System.out.print("Yes");
    }
    
}
