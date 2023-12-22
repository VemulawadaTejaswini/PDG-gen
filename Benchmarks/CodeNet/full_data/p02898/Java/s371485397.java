import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int K=sc.nextInt();
        int num=0;
        Integer h[]=new Integer[N];
        for(int i=0;i<N;i++){
            h[i]=sc.nextInt();
            if(h[i]>=K)num++;
        }
        System.out.println(num);
    }
}