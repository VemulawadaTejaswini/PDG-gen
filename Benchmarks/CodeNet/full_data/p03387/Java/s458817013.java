import java.util.*;
import java.awt.geom.Point2D;
import java.awt.*;
import static java.lang.System.*;
import static java.lang.Math.*;
//Loopで使う文字列の長さは固定！
//intで大丈夫？オーバーフローしない？
//Loop回数は本当に10⁹以内になってる？Loopは回る？？
public class Main {
    public static void main(String[]$){
        Scanner sc = new Scanner(in);
        int[] x=new int[3];
        x[0]=sc.nextInt();
        x[1]=sc.nextInt();
        x[2]=sc.nextInt();
        Arrays.sort(x);
        int max=x[2]+1;
        Queue<Integer> qa=new ArrayDeque<>();
        qa.add(x[0]);
        Queue<Integer> qb=new ArrayDeque<>();
        qb.add(x[1]);
        Queue<Integer> qc=new ArrayDeque<>();
        qc.add(x[2]);
        Queue<Integer> ans=new ArrayDeque<>();
        ans.add(0);
        while(!qa.isEmpty()){
            int tans=ans.poll();
            x[0]=qa.poll();
            x[1]=qb.poll();
            x[2]=qc.poll();
            if(x[0]==x[1]&&x[1]==x[2]){
                out.println(tans);
                break;
            }else{
                Arrays.sort(x);
                if(x[0]+1<=max){
                    qa.add(x[0]+1);
                    qb.add(x[1]+1);
                    qc.add(x[2]);
                    ans.add(tans+1);
                }
                if(x[0]+2<=max){
                    qa.add(x[0]+2);
                    qb.add(x[1]);
                    qc.add(x[2]);
                    ans.add(tans+1);
                }
            }
        }
    }
}