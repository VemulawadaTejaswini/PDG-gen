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
        int ans = sc.nextInt();
        ans += sc.nextInt();
        ans += sc.nextInt();
        if(ans > 21){
            System.out.print("bust");
        }else{
            System.out.print("win");
        }
        
    }
    
}
