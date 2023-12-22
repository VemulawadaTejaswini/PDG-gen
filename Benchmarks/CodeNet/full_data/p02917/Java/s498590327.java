import java.util.*;
class Main{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        int N = sc.nextInt(),B[] = new int[N-1],ans[]=new int[N],temp=0;
        for(int i=0;i<N-1;i++){
            B[i]=sc.nextInt();
            ans[0]=B[0];
            if(i!=0)
              ans[i] = Math.min(B[i],B[i-1]);
        }
        ans[N-1]=B[N-2];
        for(int i=0;i<N;i++){
            temp+=ans[i];
        }
       System.out.println(temp);
    }
}