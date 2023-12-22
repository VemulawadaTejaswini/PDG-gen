import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        
        boolean shouldSwap = false, shouldSwapBefore = false, shouldSwapMoreBefore = false;
        int swapCount = 0;
        
        for(int i = 0; i < N; i++) {
            int p = scan.nextInt();
            shouldSwap = (p == i+1 ? true : false);
            
            if(i == 0 && shouldSwap) {
                swapCount++;
            } else if(!shouldSwapBefore && shouldSwap) {
                swapCount++;
            } else if(shouldSwapMoreBefore && shouldSwapBefore && shouldSwap) {
                swapCount++;
            }
            shouldSwapMoreBefore = shouldSwapBefore;
            shouldSwapBefore = shouldSwap;
        }
        
        System.out.println(swapCount);
    }
}
