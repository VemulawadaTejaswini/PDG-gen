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
        double tax = 1.08;
        int ans = (int) (n/tax);
        if((int)(ans*tax) == n){
            System.out.print(ans);
        }else{
            if((int)((ans+1)*tax) == n){
            System.out.print(ans+1);
             }else{
            //System.out.print(ans + " " + (int)(ans*tax));
            System.out.print(":(");
        }
        }
        
    }
    
}
