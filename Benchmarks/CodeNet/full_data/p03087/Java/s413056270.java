
import java.util.ArrayList;
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
        ArrayList<Integer> is = new ArrayList<>();
        
        for (int i = 1; i < str.length(); i ++) {
            if (str.substring(i - 1, i + 1).equals("AC"))
                is.add(i);
        }
        
        for (int i = 0; i < q; i ++) {
            int l = s.nextInt();
            int r = s.nextInt();
            for (int pos : is) {
                if (l <= pos && r >= pos + 1)
                    outputs[i] ++;
            }
        }
        
        for (int i : outputs)
            System.out.println(i);
        
    }
    
}
