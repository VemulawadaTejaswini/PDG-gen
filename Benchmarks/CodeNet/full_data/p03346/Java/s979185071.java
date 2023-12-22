import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] pos = new int[n];//pos[数字]=n番目

        for(int i = 0; i < n; i++) {//pはi個目にある
            int p = sc.nextInt()-1;
            pos[p] = i;
        }

        int ans = 0;
        boolean isUpping = true;
        int count = 0;
        for(int i = 0; i < n-1; i++) {
            int num = i;
            int next = i+1;
            if(isUpping) {
                if(pos[num] < pos[next]) {
                    count++;
                } else {
                    isUpping = false;
                    ans = Math.max(ans, count);
                    count = 1;
                }
            } else {
                if(pos[num] > pos[next]) {
                    count++;
                } else {
                    isUpping = true;
                    //ans = Math.max(ans, count);
                    count = 1;
                }
            }
        }
        ans = Math.max(ans, count);
//        System.out.println(Arrays.toString(pos));
//        System.out.println(ans+1);
        System.out.println(n-ans-1);
    }
}