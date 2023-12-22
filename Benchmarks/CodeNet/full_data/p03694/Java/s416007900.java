import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int min = Integer.MAX_VALUE;
        int max = 0;
        
        for(int i = 0; i < n; i++){
            int j = sc.nextInt();
            min = Math.min(min, j);
            max = Math.max(max, j);
        }
        
        System.out.println(max-min);
    }
}
