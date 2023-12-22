import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int color = 1;
        int[] colors = new int[N];
        colors[0] = sc.nextInt();
        for (int i=0; i<N-1; i++) {
            int A = sc.nextInt();
            int minIdx = -1;
            int min = -1;
            for(int j=0; j<color; j++) {
                if(colors[j] < A && (minIdx == -1 || A-colors[j] < min)) {
                    min = A-colors[j];
                    minIdx = j;
                }
            }
            if(minIdx == -1) {
                minIdx = color;
                color += 1;
            }
            colors[minIdx] = A;
        }
        System.out.println(color);
    }
}