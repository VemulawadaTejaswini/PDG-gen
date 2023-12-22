import java.util.*;
public class Main{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] b = new int[1000000001];
        int sum = 0;
        for(int i=1; i<=n; i++){
            int a = sc.nextInt();
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