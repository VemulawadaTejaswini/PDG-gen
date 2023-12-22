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
        if(m != 1 && max(l) > min(r)){
            count = 0;
        }
        else{
            count = min(r) -max(l) +1;
        }
        System.out.println(count);
    }
    public static int max(int[] a){
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            int v = a[i];
            if (v > max) {
              max = v;
            }
        }
        return max;
    }
    public static int min(int[] a){
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            int v = a[i];
            if (v < min) {
              min = v;
            }
        }
        return min;
    }
}
