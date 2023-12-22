

import static java.util.Arrays.binarySearch;
import java.util.Scanner;
import static java.util.Arrays.sort;

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
        int num = sc.nextInt();
        int tmp;
        int n[]= new int[num];
        int count=0;
        for(int i=0;i<num;i++){
            n[i] = sc.nextInt();
        }
        sort(n);
        for(int i=0;i<num-1;i++){
            for(int j=i+1;j<num-1;j++){
                for(int k = j+1;k<num;k++){
                    if(n[i]+n[j]<n[k])count++;
                    else break;
                }
            }
        }
        System.out.println(count);
    }
    
}
