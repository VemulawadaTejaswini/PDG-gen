import java.util.*;
public class Main{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] b = new int[n+1];
        int cnt = 0;
        int sum = 0;
        for(int i=1; i<=n; i++){
            int a = sc.nextInt();
            if(b[a] == 0) cnt++;
            b[a]++;
        }
        for(int i=0; i<=n; i++){
            if(i == b[i]) continue;
            if(i > b[i]) sum += b[i];
            if(i < b[i]) sum =  sum + b[i] - i;
        }
        System.out.println(sum);
    }
}