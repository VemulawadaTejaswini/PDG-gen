import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] L = new int[n];
        int sum = 0;
        int tmp = 0;
        int ans = 1;

        for(int i = 0;i < n;i++){
            L[i] = sc.nextInt();
        }
        for(int i = 0;i < x;i++){
            sum += L[i] + tmp;
            tmp = L[i];
            if(x < sum)
            break;
            ans++;
        }
        System.out.println(ans);
    }
}