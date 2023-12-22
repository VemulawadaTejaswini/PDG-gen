import java.util.*;
import java.lang.*;

public class Main {
    static class pair{
        double f,s;
        pair(double f,double s){
            this.f=f;
            this.s=s;
        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int c=in.nextInt();
        long sum=in.nextLong();
        long res=sum;
        for(int i=1;i<c-1;i++){
            int x=in.nextInt();
            sum+=x;
        }
        System.out.println(sum+res);

        in.close();
    }
}
