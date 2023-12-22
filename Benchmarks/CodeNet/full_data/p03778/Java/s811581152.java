import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans;
        if(a>=b-W&&a<=b+W) ans=0;
        else if(a+W<b){
            ans = b-a-W;
        }
        else ans = a-b-W;
        System.out.println(ans);

    }
}
