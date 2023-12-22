import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)a[i]=sc.nextInt();
        long ans = 0;
        for(int i=0;i<n-1;i++){
            if(a[i]<0){
                a[i]*=-1;
                a[i+1]*=-1;
            }
        }
        if((a[n-2]<0&&a[n-1]<0)||(a[n-1]>=0&&a[n-2]>=0)){
            a[n-2]=Math.abs(a[n-2]);
            a[n-1]=Math.abs(a[n-1]);
        }else{
            if(Math.abs(a[n-2])>Math.abs(a[n-1])){
                a[n-2]=Math.abs(a[n-2]);
                a[n-1]=-1*Math.abs(a[n-1]);
            }else{
                a[n-2]=-1*Math.abs(a[n-2]);
                a[n-1]=Math.abs(a[n-1]);
            }
        }

        for(Integer i:a)ans+=i;

        System.out.println(ans);
    }
}
