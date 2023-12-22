import java.util.*;

class Main{
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        int N=sc.nextInt(),K=sc.nextInt()-1,A,mini=0,res=0;
        for(int i=0;i<N;i++){
            A=sc.nextInt();
            if(A==1){
                mini=i;
                break;
            }
        }
        res+=mini/K;
        if(mini%K!=0){
            res++;
        }
        res+=((N-mini-1)/K);
        if((N-mini-1)%K!=0){
            res++;
        }
        System.out.println(res);
    }
}