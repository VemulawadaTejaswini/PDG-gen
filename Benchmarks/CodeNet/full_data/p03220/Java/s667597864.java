import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = Integer.parseInt(sc.next());
        
        sc.next();
        sc.next();
        
        int[] j = new int[N];
        
        for(int i = 0; i < N; i++){
            j[i] = Integer.parseInt(sc.next());
        }
        
        Arrays.sort(j);
        
        System.out.println(j.length);
    }
}