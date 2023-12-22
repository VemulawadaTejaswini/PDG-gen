import java.util.Scanner;
import java.util.*;

public class Ringo {

    public static void main(String[] args)
    {
        Scanner key = new Scanner(System.in);
        String word = key.nextLine();
        
        StringTokenizer st = new StringTokenizer(word);
        
        int D = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int val = 0;
        
        if (D == 0)
        {
            System.out.println(N);
        }
        
        else
        {
            val = (int) (Math.pow(100,D));
        
            System.out.println(N * val);
        }
    }
}