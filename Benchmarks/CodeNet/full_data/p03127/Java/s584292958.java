import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }
        int pre = 0;
        while(true){
            Arrays.sort(h);
            if(pre == h[0]) break;
            pre = h[0];
            for(int i = 1; i < n; i++){
                if(h[i] % pre != 0) h[i] = h[i] % pre;
            }
        }
        System.out.println(h[0]);
        sc.close();
    }

}
