
import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here   
        Scanner sc = new Scanner(System.in);
        StringBuilder builder = new StringBuilder();
        String s = sc.next();
        for(int i = 0 ; i < s.length(); i += 2){
            builder.append(s.charAt(i));
        }
        
        System.out.println(builder.toString());
    }
    
}
