
import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        String dance = s.next();
        
        String output = "Yes";
        
        for (int i = 0; i < dance.length(); i ++) {
            if (i % 2 == 0
                    && dance.charAt(i) != 'R'
                    && dance.charAt(i) != 'U'
                    && dance.charAt(i) != 'D')
                output = "No";
            else if (i % 2 == 1
                    && dance.charAt(i) != 'L'
                    && dance.charAt(i) != 'U'
                    && dance.charAt(i) != 'D')
                output = "No";
        }
        
        System.out.println(output);
        
    }
    
}
