import java.util.*;
import java.awt.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(in);
        int X=sc.nextInt();
        Queue<Integer> q=new ArrayDeque<>();
        Queue<Integer> time=new ArrayDeque<>();
        q.add(0);
        time.add(0);
        while(!q.isEmpty()){
            int x=q.poll();
            int t=time.poll();
            if(x==X){
                out.println(t);
                break;
            }
            t++;
            time.add(t);
            time.add(t);
            time.add(t);
            q.add(x+t);
            q.add(x);
            q.add(x-t);
        }
    }
}