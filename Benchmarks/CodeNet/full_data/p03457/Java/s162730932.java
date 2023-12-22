import java.util.*;

class Main{
    static Scanner sc = new Scanner(System.in);
    static StringBuffer sb = new StringBuffer();
    public static void main(String args[]){
        int N=sc.nextInt(),dt,dx,dy,t=0,x=0,y=0;
        String res="Yes";
        for(int i=0;i<N;i++){
            dt=t;dx=x;dy=y;
            t=sc.nextInt();x=sc.nextInt();y=sc.nextInt();
            int D=Math.abs(x-dx)+Math.abs(y-dy),T=t-dt;
            if(T<D||D%2!=T%2){
                res="No";
                break;
            }
        }
        System.out.println(res);
    }
}