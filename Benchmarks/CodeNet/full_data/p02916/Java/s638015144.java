import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] order = new int[n];
        int[] point = new int[n];
        int[] subPoint = new int[n];
        
        for(int i=0; i<n; i++){
            order[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++){
            point[i] = sc.nextInt();
        }
        for(int i=0; i<n-1; i++){
            subPoint[i] = sc.nextInt();
        }
        
        int sum = point[order[0]-1];
        for(int i=1; i<n; i++){
            sum += subPoint[order[i-1]-1];
            sum += point[order[i]-1];
        }
        
        System.out.println(sum);
    }
}