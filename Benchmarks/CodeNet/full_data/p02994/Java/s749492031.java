import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        int[] taste = new int[n];
        int ans = 0;
        int eat = 0;
        int min = 1000000000;

        for(int i = 0;i < n;i++){
            taste[i] = l+i;
            ans += taste[i];
        }

        for(int i = 0;i < n;i++){
            int tmp = Math.abs(taste[i]);
            if(tmp < min){
                min = tmp;
                eat = i;
            }
        }

        System.out.println(ans-taste[eat]);
    }
}