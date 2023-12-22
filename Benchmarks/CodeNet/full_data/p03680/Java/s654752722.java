import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new Int[n];
        int cnt = 0;
        int s = 0;
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        
        for(int i=0; i<a.lenth(); i++){
            s = a[s];
            cnt++;
            if(s == 2){
                System.out.println(cnt);
                return;
            }
        }
        System.out.println("-1");
    }
}