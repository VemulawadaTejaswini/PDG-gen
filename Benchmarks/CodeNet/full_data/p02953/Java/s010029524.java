import java.util.*;

import javax.lang.model.util.ElementScanner6;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] H = new int[N];
        for (int i = 0; i < N; i++){
            H[i] = sc.nextInt();
        }
        if(N==1)
            System.out.println("Yes");
        else {
            for(int i = N-2; i >= 0; i--){
                if(H[i] <= H[i+1])
                    continue;
                else if(H[i] == H[i+1] + 1)
                    H[i] = H[i] - 1;
                else{
                    System.out.println("No");
                    return;
                }
            }
        }
        System.out.println("Yes");
        sc.close();        
    }        
}
