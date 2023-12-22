import java.util.*;
public class Main{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = 0;
        int c = 0;
        int sum_all = 0;
        int all[] = new int[n];
        for(int i=1; i<=n; i++){
            ans = i;
            int sum = 0;
            sum += i/100;
            i -= i/100*100; 
            sum += i/10;
            i -= i/10*10;
            sum += i;
            if(a<sum && sum<b){
                all[c] = ans;
                c++;
            }
            i = ans;
        }
        for(int i=0; i<c; i++){
            sum_all += all[i];
        }
        System.out.println(sum_all);
    }
}