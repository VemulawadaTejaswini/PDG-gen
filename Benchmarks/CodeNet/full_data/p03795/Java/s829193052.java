import java.util.Scanner;

/**
 *
 * @author C0117306
 */
public class Main {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int goukei=n*800;
        int sa=n/15*200;
        System.out.println(goukei-sa);
       
    }
    
}