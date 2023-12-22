import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        long[] ar=new long[N];
        int count=0;
        for(int i=0;i<N;i++){
            //System.out.println("Hello");
            long a=sc.nextLong();
            ar[i]=a;
            if(a%2!=0){
                //System.out.println("count="+count);
                count++;
            }
        }
        //System.out.println(count);
        if(count==N){
            System.out.println("0");
        }
        else{
            int count1=0;
            boolean b=true;
            while(b){
                boolean c=true;
                for(int i=0;i<N;i++){
                    if(ar[i]%2==0 && c){
                        ar[i]/=2;
                        c=false;
                    }
                    else{
                        ar[i]*=3;
                    }
                    System.out.print(ar[i]+" ");
                }
                System.out.println();
                count1++;
                b=check(N, ar);
            }
            System.out.println(count1);
        }
    }
    
    static boolean check(int N,long [] ar){
        boolean b=false;
        for(int i=0;i<N;i++){
            if(ar[i]%2==0){
                b=true;
                break;
            }
        }    
        return b;
    }
}