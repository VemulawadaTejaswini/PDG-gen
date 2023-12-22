

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
        int number = sc.nextInt();
        int count=0;
        int maxHigh =0;
        int tmp;
        for(int i=0;i<number;i++){
            tmp = sc.nextInt();
            if(tmp >= maxHigh){
                maxHigh=tmp;
                count++;
            }
        }
        System.out.print(count);
    }
    
}
