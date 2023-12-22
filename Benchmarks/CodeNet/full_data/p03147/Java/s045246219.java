
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author yoshizaki
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int flower = scanner.nextInt();
        int[] height = new int[flower];
        for(int i = 0; i < flower; i++) height[i] = scanner.nextInt();
        int count = 0;
        while(Arrays.stream(height).max().getAsInt() > 0) {
            boolean iscount = true;
            for(int i = 0; i < flower; i++) {
                if(iscount) {
                    if(height[i] == 0) continue;
                    count++;
                    height[i]--;
                    iscount = false;
                } else {
                    if(height[i] == 0) {
                        iscount = true;
                    } else {
                        height[i]--;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
