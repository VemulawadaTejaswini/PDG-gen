import java.util.Scanner;
import java.util.Arrays;
 
public class Main{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        int[] l = new int[m];
        int[] r = new int[m];
        for(int i = 0; i < m; i++){
            l[i] = Integer.parseInt(sc.next());
            r[i] = Integer.parseInt(sc.next());
        }
        sc.close();
        
        int count = 0;
        for(int i = l[0]; i <= r[0]; i++){
            if(m != 1){
                for(int j = 1; j < m; j++){
                    if(i < l[j] || i > r[j]){
                        count += 1;
                        break;
                    }
                }
            }
            else{
                count = 0;
            }
        }
        
        System.out.println(r[0]-l[0]+1-count);
        
    }
}
