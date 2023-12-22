import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[m];
        int[] b = new int[m];
        for(int i = 0; i < m; i++){
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        int count = 0;
        for(int i = 1; i <= n; i++){
            for(int j = 0; j < m; j++){
                if(a[j] == i || b[j] == i){
                    count++;
                }
            }
            System.out.println(count);
            count = 0;
        }
    }
}