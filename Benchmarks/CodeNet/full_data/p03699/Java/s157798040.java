import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for(int i=0;i<N;i++) a[i]=sc.nextInt();
        int sum=0;
        int rec= 101;
        for(int i=0;i<N;i++){
            sum += a[i];
            if(a[i]%10!=0) rec=Math.min(rec,a[i]);
        }
        if(sum%10!=0) System.out.println(sum);
        else{
            int ans = 0;
            if(rec!=101) ans = sum-rec;
            System.out.println(ans);
        }
    }
}
 