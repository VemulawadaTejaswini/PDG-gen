import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int[] shuffled = new int[n+1];
        
        for(int i=1; i<n; i++){
            shuffled[i] = i+1;
        }
        shuffled[n] = 1;
        
        
        
        boolean flag;
        int h = n;
        do {
            flag = false;
            int max = 0;
            int maxIdx = 0;
            for (int i = 1; i < h; i++) {
                if (h % shuffled[i] > i % shuffled[i] && max <= h % shuffled[i]) {
                    maxIdx = i;
                    h = i;
                    flag = true;
                }
            }
            if (flag) {
                int temp = shuffled[maxIdx];
                shuffled[maxIdx] = shuffled[h];
                shuffled[h] = temp;
            }
        }while(flag);
        

        int result = 0;
        for(int i=1; i<n; i++){
            result += i % shuffled[i];
        }
        System.out.println(result);
    }
}