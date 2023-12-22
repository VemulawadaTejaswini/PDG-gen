import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a= new int[m];
        a[0]=sc.nextInt();
        int res=F(a[0]-1)>0?F(a[0]-1):1;
        for(int i=1;i<m-1;i++){
          a[i]=sc.nextInt();
          res*=F(a[i]-a[i-1]-2);
        }
        a[m-1]=sc.nextInt();
        res*=F(n-a[m-1]-1);
        System.out.println(res%1000000007);
            
        // 出力
       
    }

    public static int F(int b) {
        if(b<=1){
            return b;
        }
        int[] a=new int[b+1];
        a[0]=1;
        a[1]=1;
        for (int i=2;i<=b;++i){
            a[i]=a[i-1]+a[i-2];
        }
        return a[b];
    }

}


