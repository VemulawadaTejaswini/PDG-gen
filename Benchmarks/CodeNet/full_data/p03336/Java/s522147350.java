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
        long p=Long.parseLong(S,2);
        long q=Long.parseLong(T,2);
        for(int i=0;i<k;i++){
            long x=p & q;
            p=p+x;
            q=q+x;
        }
        S=Long.toBinaryString(p);
        T=Long.toBinaryString(q);
        System.out.println(S);
        System.out.println(T);
    }
    
}
