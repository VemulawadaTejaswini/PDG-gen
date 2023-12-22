import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array  = new int[n];
        for(int i=0;i<n;i++){
            array[i] = sc.nextInt();
        }
        
        int count = 1;
        for(int i:array){
            if(i==count) count++;
        }
        
        if(count == 1){
            System.out.print("-1");
        } else {
            System.out.print(n-count+1);
        }
    }
}
