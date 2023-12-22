
import java.util.Scanner;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int q = s.nextInt();
        String str = s.next();
        
        int[] outputs = new int[q];
        
        for (int i = 0; i < q; i ++) {
            int l = s.nextInt();
            int r = s.nextInt();
            String sub = str.substring(l - 1, r);
            
            for (int j = 1; j < sub.length(); j ++) {
                if (sub.substring(j - 1, j + 1).equals("AC"))
                    outputs[i] ++;
            }
        }
        
        
        for (int i : outputs)
            System.out.println(i);
        
    }
    
}
