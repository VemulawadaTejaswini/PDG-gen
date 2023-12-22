import java.util.Scanner;
import java.util.stream.IntStream;
 
public class Main{
    static IntStream REPS(int v){return IntStream.range(0,v);}
    static IntStream REPS(int l,int r){return IntStream.rangeClosed(l,r);}
    static IntStream INS(int n) {return REPS(n).map(i->getInt());}
    static Scanner s=new Scanner(System.in);
    static int getInt(){return Integer.parseInt(s.next());}
    public static void main(String[]$){
        int n=getInt(),cn=n;
        int rn=0;
        while(cn!=0) {
            rn*=10;
            rn+=cn%10;
            cn/=10;
        }
        System.out.println(rn==n?"Yes":"No");
    }
}