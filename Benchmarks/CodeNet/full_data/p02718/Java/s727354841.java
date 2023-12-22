import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner stdIn= new Scanner(System.in);
        int N = stdIn.nextInt();
        int M = stdIn.nextInt();
        int [] a=new int[N];
        double sum=0;
        for(int i=0;i<N;i++){
            a[i]=stdIn.nextInt();
            sum=sum+a[i];
        }
        
        int [] b=new int[M];
        int max=0;
        for(int i=0;i<M;i++){
            for(int t=0;t<N;t++){
               if(a[t]>b[i]){
                   b[i]=a[t];
                   max=t;
               }
           }
           a[max]=0;
        }

        
        boolean j=true;
        for(int t=0;t<M;t++){
            if(b[t]<sum/(4*M)){
                j=false;
                break;
            }
        }
        if(j){
             System.out.println("Yes");
        }else{
             System.out.println("No");
        }
       
    }
}