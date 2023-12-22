import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ary = new int[n];
        for(int i = 0; i < n; i++) ary[i] = sc.nextInt();
        for(int i = 0; i < n; i++){
            int max = 0;
            for(int j = 0; j < n; j++){
                if(i != j){
                    if(max < ary[j]) max = ary[j];
                }
            }
            System.out.println(max);
        }
    }
}