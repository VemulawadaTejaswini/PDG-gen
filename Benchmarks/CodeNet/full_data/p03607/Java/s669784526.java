import java.util.*;
import java.awt.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(in);
        int n=sc.nextInt();
        int ans=0;
        HashMap<Integer,Integer> m=new HashMap<>();
        for (int i = 0; i < n; i++) {
            int c=sc.nextInt();
            m.put(c, 1+m.getOrDefault(c, 0));
        }
        for(int k:m.keySet()){
            if(m.get(k)%2==1)ans++;
        }
        out.println(ans);
    }
}