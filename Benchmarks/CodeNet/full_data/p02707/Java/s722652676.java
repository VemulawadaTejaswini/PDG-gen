import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       
        // 配列
        int[] a = new int[n+1];
        for(int i=2;i<=n;i++){
            a[i] += sc.nextInt();
        }
        
        int[] cnt =  new int[n+1];
        for(int i=2;i<=n;i++){
            cnt[a[i]]++;
        }

        for(int i=1;i<=n;i++){
            System.out.println(cnt[i]);
        }
    }
}
