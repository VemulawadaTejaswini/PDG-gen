import java.util.Scanner ;
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a , b ;
        Scanner in = new Scanner(System.in); 
        a = in.nextInt(); 
        b = in.nextInt(); 
        if (a <= b )
            a = b ; 
        if (a <= 8 )
            System.out.println("Yay!");
        else 
            System.out.println(":(\n");
    }
    
}
