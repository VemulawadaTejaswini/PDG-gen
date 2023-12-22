import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] t=new int[N];
        int[] x=new int[N];
        int[] y=new int[N];
        for(int i=0;i<N;i++){
            t[i]=sc.nextInt();
            x[i]=sc.nextInt();
            y[i]=sc.nextInt();
        }
        int dx=0;
        int dy=0;
        int dt=0;
        for(int i=0;i<N;i++){
            if(i==0){
                dx=Math.abs(x[i]);
                dy=Math.abs(y[i]);
                dt=t[i];
                if(!(dx+dy<=dt && (((dx+dy)%2==0 && (dt%2)==0) || ((dx+dy)%2!=0 && (dt%2)!=0)))){
                    System.out.println("No");
                    System.exit(0);
                }
            }else{
                dx=Math.abs(x[i]-x[i-1]);
                dy=Math.abs(y[i]-y[i-1]);
                dt=t[i]-t[i-1];
                if(!(dx+dy<=dt && (((dx+dy)%2==0 && (dt%2)==0) || ((dx+dy)%2!=0 && (dt%2)!=0)))){
                    System.out.println("No");
                    System.exit(0);
                }
            }
        }
        System.out.println("Yes");
    }
}