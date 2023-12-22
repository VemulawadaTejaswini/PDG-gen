import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int[] a = new int[n+1];
        for(int i = 1; i <= n; i++){
            a[i] = Integer.parseInt(sc.next());
        }
        
        boolean[] b = new boolean[n+1];
        for(int i = n; i >= 1; i--){
            int x = 0;
            for(int j = 2; i*j <= n; j++){
                if(b[i*j]){
                    x++;
                }
            }
            if(x%2 != a[i]){
                b[i] = true;
            }
        }
        
        int m = 0;
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= n; i++){
            if(b[i]){
                m++;
                sb.append(i).append(" ");
            }
        }
        
        if(m == 0){
            System.out.println(0);
        }else{
            System.out.println(m);
            System.out.println(sb);
        }
    }
}