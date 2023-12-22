
import java.util.Scanner;
import java.util.Arrays;

class Main{
        public static void main(String[] args){
                Scanner scanner=new Scanner(System.in);
                int N=scanner.nextInt();
                int[] a=new int[N+1];
                for(int i=0;i<N;i++){
                        a[i]=scanner.nextInt();
                }
                a[N]=-1;
                Arrays.sort(a);
                int[] b=new int[a.length];
                int n=1;
                int j=0;
                for(int i=0;i<a.length-1;i++){
                        if(a[i+1]==-1){
                                b[j]=n;
                        }else{
                                if(a[i]==a[i+1]){
                                        n++;
                                }else{
                                        b[j++]=n;
                                        n=1;
                                }
                        }
                }
                int sum=0;
                for(int i=0;i<b.length-2;i++){
                        if(n<(sum=b[i]+b[i+1]+b[i+2])){
                                n=sum;
                        }
                }
                System.out.println(n);
        }
}