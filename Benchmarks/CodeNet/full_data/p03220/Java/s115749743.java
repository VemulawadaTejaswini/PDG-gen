import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt()*1000;
        int a = sc.nextInt();
        int min = 0;
        int ans = 0;
        for(int i = 1;i <= n;i++){
            int tpr = t - sc.nextInt()*6;
            int sa = Math.abs(a-tpr);
            if(i == 1 || min > sa){
                min = sa;
                ans = i;
            }
        }
        System.out.println(ans);
    }
}