import java.util.*;
import java.awt.*;
import static java.lang.System.*;
import static java.lang.Math.*;
//Loopで使う文字列の長さは固定！
//intで大丈夫？オーバーフローしない？
//Loop回数は本当に10⁹以内になってる？Loopは回る？？
public class Main {
//    public static void main(String[] args){
    public static void main(String[]$){
        Scanner sc = new Scanner(in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        if(x==0||y==0){
            if(x==0&&y==0){
                out.println(0);
            }else if(x==0){
                if(y<0)out.println(1-y);
                else out.println(y);
            }else{
                if(x<0)out.println(1-x);
                else out.println(x);
            }
        }else if(x>0&&y>0){
            if(x>y)out.println(2+x-y);
            else out.println(y-x);
        }else if(x<0&&y>0||x>0&&y<0){
            out.println(abs(x+y)+1);
        }else{
            if(x<y)out.println(y-x);
            else out.println(x-y+2);
        }
    }
}
