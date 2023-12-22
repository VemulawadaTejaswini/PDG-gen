import java.util.*;
import java.awt.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(in);
        int n=sc.nextInt();
        String[] a=new String[n+1];
        for (int i = 1; i <= n; i++) {
            a[i]=sc.next();
        }
        StringBuilder ans=new StringBuilder(a[1]);
        if(n%2==0){
            for (int i = 2; i <= n; i++) {
                if(i%2==0){
                    ans.insert(0, a[i]+" ");
//ans=a[i]+" "+ans;
                }else{
                    ans.append(" "+a[i]);
                    //ans=ans+" "+a[i];
                }
            }
        }else{
            for (int i = 2; i <= n; i++) {
                if(i%2==0){
                    ans.append(" "+a[i]);
                    //ans=ans+" "+a[i];
                }else{
                    ans.insert(0, a[i]+" ");
                    //ans=a[i]+" "+ans;
                }
            }
        }
        out.println(ans);
    }
}