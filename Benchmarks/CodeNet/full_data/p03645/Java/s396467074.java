
import java.util.Scanner;

class Main{
        public static void main(String[] args){
                Scanner scanner=new Scanner(System.in);
                int n=scanner.nextInt();
                int m=scanner.nextInt();
                int a=0;
                int b=0;
                int c[]=new int[200000];
                int d[]=new int[200000];
                int indexC=0;
                int indexD=0;
                boolean possible=false;
                if(m==1){
                        for(int i=0;i<2*m;i++){
                                scanner.nextInt();
                        }
                        System.out.println("IMPOSSIBLE");
                        return;
                }
                if(m>(n-2)*(n-1)/2){
                        for(int i=0;i<2*m;i++){
                                scanner.nextInt();
                        }
                        System.out.println("POSSIBLE");
                        return;
                }
                for(int i=0;i<m;i++){
                        a=scanner.nextInt();
                        b=scanner.nextInt();
                        if(a==1){
                                c[indexC++]=b;
                        }
                        if(b==n){
                                d[indexD++]=a;
                        }
                }
                for(int i=0;c[i]!=0;i++){
                        for(int j=0;d[j]!=0;j++){
                                if(c[i]==d[j]){
                                        System.out.println("POSSIBLE");
                                        return;
                                }
                        }
                }
                System.out.println("IMPOSSIBLE");
        }
}