import java.util.Scanner;

/**
 *
 * @author kke2
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chair = sc.nextInt();
        int wid = sc.nextInt();
        int syai = sc.nextInt();
        int i=0;
        int j=0;
        j = syai;
        for(i=0;j<chair;i++){
         j= wid+syai+j;
        }
        System.out.println(i);
        // TODO code application logic here
    }

}
