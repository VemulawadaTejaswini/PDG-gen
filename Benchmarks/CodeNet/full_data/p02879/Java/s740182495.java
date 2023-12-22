import java.util.Scanner;

/**
 *
 * @author C0117177
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        if(a <= 9 && b<= 9){
            System.out.println(a * b);
        }else{
            System.out.println(-1);
        }
        sc.close();  
    }  
}