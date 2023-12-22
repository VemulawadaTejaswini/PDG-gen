import java.util.*;

public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int [] m = new int [N];
        int sum = 0;
        
        for(int i=0; i<N; i++){
            m[i] = sc.nextInt();
            sum +=m[i];
        }
        
        int nokori = X -sum;
        int ans =0;
        int min = m[0];
        
        for(int i=1; i<N; i++){
            if(min>m[i]){
                min = m[i];
            }
        }
        
        ans =N + (int)nokori/min;
        
        System.out.println(ans);
    }
}
