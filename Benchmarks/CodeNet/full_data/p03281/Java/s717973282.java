
import java.util.*;

public class Main {
    static int n;
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        n=scanner.nextInt();
        solve();
    }
    public static void solve(){
        int ans=0;
        for(int i=1;i<=n;i+=2){
            if(func(i)==8){
                ans++;
            }
        }
        put(ans);
    }
    public static int func(int n){
        int ans=0;
        for(int i=1;i<=n;i++){
            if(n%i==0) ans++;
        }
        return ans;
    }

    public static void put(Object object){
        System.out.println(object);
    }
    public static String format(String string,Object... args){
        return String.format(string,args);
    }

    public static class Pair{
        final public int x,y;
        Pair(int x,int y){
            this.x=x;
            this.y=y;
        }
    }
}
