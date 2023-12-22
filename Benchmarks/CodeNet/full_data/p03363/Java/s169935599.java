import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] s = new long[n+1];
        s[0] = 0;
        for (int i=1;i<=n;i++){
            s[i]=s[i-1]+sc.nextLong();

        }
        Arrays.sort(s);
        int count = 1;
        int ans = 0;
        for (int i=0;i<n;i++){
            while (i<n&&s[i]==s[i+1]){
                i++;
                count++;
            }
            ans+=combination(count,2);
            count=1;
        }
        System.out.println(ans);
    }
    static long factorial(int num){
        if (num<2)return 1;
        else return num*factorial(num-1);
    }
    static int arraySum(int[] array){
        int ans = 0;
        for (int value : array) ans += value;
        return ans;
    }
    static long combination(int a, int b){
        return factorial(a)/(factorial(b)*factorial(a-b));
    }
    static double log(double base,double antilogarithm){
        return Math.log(antilogarithm)/Math.log(base);
    }
}
