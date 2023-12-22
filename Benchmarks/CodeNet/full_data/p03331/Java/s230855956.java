import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int min = Integer.MAX_VALUE;
        
        for(int i = 1; i < n; i++){
            int a = n - i;
            int b = i;
            
            min = Math.min(min, sum(a) + sum(b));
        }
        
        System.out.println(min);
    }
    
    public static int sum(int a){
        String str = String.valueOf(a);
        int sum = 0;
        for(char c : str.toCharArray()){
            sum+=c-'0';
        }
        return sum;
    }
}
