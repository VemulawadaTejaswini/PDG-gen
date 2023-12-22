import java.util.Scanner;

/**
 *
 * @author Suraj
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        int m=in.nextInt();
        int k=in.nextInt();
        String S=Long.toString(in.nextLong());
        String T=Long.toString(in.nextLong());
        int p=Integer.parseInt(S,2);
        int q=Integer.parseInt(T, 2);
        for(int i=0;i<k;i++){
            int x=p & q;
            p=p+x;
            q=q+x;
        }
        S=Integer.toBinaryString(p);
        T=Integer.toBinaryString(q);
        System.out.println(S);
        System.out.println(T);
    }
    
}
