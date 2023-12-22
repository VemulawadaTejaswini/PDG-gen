import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        int[] sum = new int[n];
        int ans = 0;
        for(int i = 0;i < n;i++){
            s[i] = sc.next();
        }
        for(int i = 0;i < n-1;i++){
            int[] c = s[i].getBytes();
            for(int j = 0;j < s[i].length();j++){
                sum[i] += c[j];
            }
        }
        for(int i = 0;i < n;i++){
            for(int j = i;j < n;j++){
                if(sum[i] == sum[j]){
                    ans++;
                }
            }
        }

        System.out.println(ans);
    }
}