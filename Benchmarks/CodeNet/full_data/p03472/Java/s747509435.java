import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int h = scan.nextInt();

        Integer[] a = new Integer[n];
        Integer[] b = new Integer[n];
        for(int i=0; i<n; i++){
            a[i] = scan.nextInt();
            b[i] = scan.nextInt();
        }

        Arrays.sort(a, Collections.reverseOrder());
        Arrays.sort(b, Collections.reverseOrder());

        int sum = 0;
        int cnt = 0;
        for(int i=0; i<n; i++){
            if(b[i] < a[0]){
                break;
            }
            sum += b[i];
            cnt++;
            if(sum >= h) break;
        }
        while(sum < h){
            sum += a[0];
            cnt++;
        }
        

        System.out.println(cnt);

        scan.close();
        
    }
}