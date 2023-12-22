import java.util.*;
import java.awt.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),c=sc.nextInt(),k=sc.nextInt();
        int[] t=new int[n];
        for (int i = 0; i < n; i++) {
            t[i]=sc.nextInt();
        }
        Arrays.sort(t);
        int ans=0,tmp=0,pas=0;
        for (int i = 0; i < n; i++) {
            if(i==0){
                ans++;
                tmp=t[i];
                pas++;
            }else{
                if(tmp+k>=t[i]&&pas<c){
                    pas++;
                }else{
                    pas=1;
                    ans++;
                    tmp=t[i];
                }
            }
        }
        out.println(ans);
    }
}