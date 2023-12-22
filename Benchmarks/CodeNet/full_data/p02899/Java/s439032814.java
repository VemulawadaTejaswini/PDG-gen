
import java.util.Scanner;

/**
 *
 * @author cs18097
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ary[] = new int[n];
        for(int i=0;i<ary.length;i++)ary[sc.nextInt()-1] = i;
        for(int i=0;i<ary.length;i++)System.out.print(ary[i]+1);
    }
    
}
