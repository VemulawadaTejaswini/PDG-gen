import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());
        int ans=0;

        if(s*2>=c){
            ans+=s;
            s-=s;
            c-=2*s;
        }else{
            while (s>=1 && c>=2){
                ans++;
                s--;
                c-=2;
            }
        }

        ans+=c/4;   //©だけで作れる個数
        
        System.out.println(ans);
    }
}