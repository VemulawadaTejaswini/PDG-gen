import java.util.*;
class Main{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        int N = sc.nextInt();
        int ans = 0;
        for(int i=1;i<=n;i++){
        if(((i%3)!=0)&&((i%5)!=0))
        ans= ans+i;
        }
        System.out.println(ans);
    }
}