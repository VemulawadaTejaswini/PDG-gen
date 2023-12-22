import java.util.*;

class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int n = sc.nextInt();

        int[] l = new int[100];
        
        int cnt= 0;
        if(A<B){
            for(int i=1;i<=A;i++){
                if((A%i==0)&&(B%i==0)){
                    l[cnt++]=i;
                    }else{
                        continue;
                    }
                }
                System.out.println(l[cnt-n]);
            }
        if(B<A){
            for(int j=1;j<=B;j++){
                if((A%j==0)&&(B%j==0)){
                    l[cnt++]=j;
                }else{
                    continue;
                }
                }
            }
            System.out.println(l[cnt-n]);
        }
}