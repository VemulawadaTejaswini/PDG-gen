import java.util.Scanner;

/**
 *
 * @author mustafa
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String s = sc.nextLine();
        
        long sayac = 1;
        
        for (int i = 0; i < s.length() - 1; ++i)
        {
            for (int j = i + 1; j < s.length(); ++j)
            {
                if (s.charAt(i) == s.charAt(j))
                    continue;
                else
                    sayac++;
            }
        }
        
        System.out.println(sayac);
    }
    
}
