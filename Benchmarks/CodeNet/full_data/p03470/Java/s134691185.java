
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        Integer[] d = new Integer[n];
        for(int i=0;i<n;i++){
            d[i] = Integer.parseInt(sc.next());
        }
        Arrays.sort(d, Collections.reverseOrder());
        int prev = d[0];
        int cnt =1;
        for(int i=1;i<n;i++){
            if(prev!=d[i]){
                cnt++;
                prev = d[i];
            }else{
                continue;
            }
        }
        System.out.println(cnt);

    }
}