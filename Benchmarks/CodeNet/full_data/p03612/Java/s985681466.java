
import java.util.Scanner;

class Main{
        public static void main(String[] args){
                Scanner scanner=new Scanner(System.in);
                int N=scanner.nextInt();
                boolean[] a=new boolean[N+1];
                for(int i=1;i<N+1;i++){
                        a[i]=scanner.nextInt()==i;
                }

                int ans=0;
                for(int i=1;i<N;i++){
                        if(a[i]){
                                a[i]=a[i+1]=false;
                                ans++;
                        }
                }

                System.out.println(ans);
        }
}