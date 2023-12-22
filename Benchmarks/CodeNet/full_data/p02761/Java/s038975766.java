import java.util.Scanner;

public class Main {

    public static boolean guess(int N, int M){
        Scanner sc=new Scanner(System.in);
        if(N<0 || N>3) return false;
        if(M<0 || M>5) return false;
        int[] a=new int[]{-1,-1,-1};
        for(int i=0;i<N;i++){
            int s=sc.nextInt()-1;
            int c=sc.nextInt();
            if(c<0 || c>9) return false;
            if(a[s]==-1)
                a[s]=c;
            else if(a[s]!=c)
                return false;
            if((N==2 && a[0]==0) ||(N==3 && a[0]==0))
                return false;
        }
        for(int i=0;i<N;i++){
            if(a[i]==-1)
                a[i]=0;
        }
        int sum=a[0]*100+a[1]*10+a[2];
        System.out.println(sum);
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
           System.out.println(guess(N,M)?"":"-1");    
    }
    
}
