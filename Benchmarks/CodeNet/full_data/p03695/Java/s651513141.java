import java.util.*;

class Main{
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        int N=sc.nextInt();
        boolean f[]=new boolean[8];
        int p=0,c=0;
        Arrays.fill(f, true);
        for(int i=0;i<N;i++){
            int a=sc.nextInt()/400;
            if(a>7){
                p++;
            }
            else if(f[a]){
                c++;
                f[a]=false;
            }
        }
        int m=c+p;
        if(c==0) c++;
        System.out.println(c+" "+m);
    }
}