import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] wb = new int[n];
        for(int i = 0; i<n-1; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            int w = sc.nextInt();
            if(w % 2 == 0){
                wb[u-1] = 1;
                wb[v-1] = 1;
            }
        }
        sc.close();
        
        for(int i = 0; i<n; i++){
            System.out.println(wb[i]);
        }
    }
}
