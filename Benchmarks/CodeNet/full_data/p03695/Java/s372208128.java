import java.util.*;

class Main{
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        int N=sc.nextInt();
        boolean f[]=new boolean[7];
        int p=0,c=0;
        Arrays.fill(f, true);
        for(int i=0;i<N;i++){
            int a=sc.nextInt()/400;
            if(a>6){
                p++;
            }
            else if(f[a]){
                c++;
                f[a]=false;
            }
        }
        int min=c+(p&1),max=c+p;
        System.out.println(min+" "+max);
    }
}