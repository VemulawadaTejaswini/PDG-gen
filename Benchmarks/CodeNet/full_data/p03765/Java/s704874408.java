import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] S=sc.next().toCharArray();
        char[] T=sc.next().toCharArray();
        int[] Si=new int[S.length];
        int[] Ti=new int[T.length];
        for(int i=0;i<S.length;i++){
            Si[i]=S[i]-'A'+1;
        }
        for(int i=0;i<T.length;i++){
            Ti[i]=T[i]-'A'+1;
        }
        int[] SiSpeed=new int[S.length/100];
        int[] TiSpeed=new int[T.length/100];
        for(int i=0;i<S.length/100;i++){
            SiSpeed[i]=0;
            for(int j=0;j<100;j++){
                SiSpeed[i]+=Si[100*i+j];
            }
        }
        for(int i=0;i<T.length/100;i++){
            TiSpeed[i]=0;
            for(int j=0;j<100;j++){
                TiSpeed[i]+=Si[100*i+j];
            }
        }
        int q=sc.nextInt();
        for(int i=0;i<q;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int d=sc.nextInt();
            int result=0;
            for(int s=a-1;s<b;s++){
                if(s%100==0&&(b-s)>100){
                    result+=SiSpeed[s/100];
                    s+=99;
                }else{
                    result+=Si[s];
                }
            }
            for(int t=c-1;t<d;t++){
                if(t%100==0&&(d-t)>100){
                    result-=TiSpeed[t/100];
                    t=t+99;
                }else {
                    result -= Ti[t];
                }
            }
            if(result%3==0){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }

    }
}