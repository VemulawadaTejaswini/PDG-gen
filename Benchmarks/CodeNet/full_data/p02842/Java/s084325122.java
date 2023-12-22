import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String ans = ":(";
        int i = 100;
        while(i<n*100){
            if(i*1.08>=n*100&&i*1.08<=n*100+99){
                ans = String.valueOf(i/100);
                break;
            }
            i += 100;
        }
        System.out.println(ans);
    }
}