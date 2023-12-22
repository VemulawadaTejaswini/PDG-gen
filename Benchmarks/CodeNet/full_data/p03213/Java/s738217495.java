import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int[] prime = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
        int[] num = new int[100];
        for(int i=2; i<=n; i++){
            int tmp = i;
            while(tmp != 1){
                for(int j=0; j<prime.length; j++){
                    if(tmp % prime[j] == 0){
                        num[prime[j]]++;
                        tmp /= prime[j];
                    }
                }
            }
        }

        int num75=0, num25=0, num15=0, num5=0, num3=0;
        for(int i=0; i<num.length; i++){
            if(num[i] >= 74) num75++;
            if(num[i] >= 24) num25++;
            if(num[i] >= 14) num15++;
            if(num[i] >= 4) num5++;
            if(num[i] >= 2) num3++;
        }

        long ans = num75;
        ans += num25 * (num3-1);
        ans += num15 * (num5-1);
        ans += num5 * (num5-1) * (num3-2) / 2;

        System.out.println(ans);
    }
}