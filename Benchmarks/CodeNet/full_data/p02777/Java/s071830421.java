import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
       Ball b=new Ball(scan.next(),scan.next(),scan.nextInt(),scan.nextInt());
       Ball.decrement(b,scan.next());
       System.out.print(Ball.sn+" "+Ball.tn);

    }
}
class Ball{
    public static int sn;
    public static int tn;
    public static String s;
    public static String t;
    public Ball(String s,String t,int sn,int tn){
        this.sn=sn;
        this.tn=tn;
        this.s=s;
        this.t=t;
    }
    public static void decrement(Ball b,String u){
        if (u.equals(s)){
            sn-=1;
        }else {
            tn-=1;
        }

    }

}