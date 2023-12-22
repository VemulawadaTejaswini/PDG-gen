import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int max = 0;
        int[] list = new int[a];
        for (int i = 0; i < a; i++) {
            list[i] = sc.nextInt();
            if(list[i] > max) {
                max = list[i];
            }
        }
        int ans = 0;
        for(int i = 0;i < max;i++){
            boolean flg = false;
            for(int j = 0; j < a; j++){
                if(list[j] > i && !flg){
                    ans++;
                    flg = true;
                } else if(list[j] <= i) {
                    flg = false;
                }
            }
        }
        System.out.println(ans);
    }
}
