import java.util.Scanner;
import java.util.Arrays;
 
public class Main{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        int[] l = new int[m];
        int[] r = new int[m];
        int l1 = min(l); 
        int r1 = max(r);
        for(int i = 0; i < m; i++){
            l[i] = Integer.parseInt(sc.next());
            r[i] = Integer.parseInt(sc.next());
        }
        sc.close();
        
        int count = 0;
        if(m != 1 && l1 > r1){
            count = 0;
        }
        else{
            count = r1 -l1 +1;
        }
        
        System.out.println(count);
        
    }
}
