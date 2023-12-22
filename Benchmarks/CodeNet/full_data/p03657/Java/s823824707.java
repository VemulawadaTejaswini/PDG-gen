import java.util.Scanner;

/**
 *
 * @author ena000078
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        int SHEEP = 3;
        
        boolean pos = false;
        if (A % SHEEP == 0){
            pos = true;
        }else if(B % SHEEP == 0){
            pos = true;
        }else if ((A + B) % SHEEP == 0){
            pos = true;
        }
        
        if(pos){
            System.out.println("Possible");
        }else{
            System.out.println("Impossible");
        }
        
    }
    
}
