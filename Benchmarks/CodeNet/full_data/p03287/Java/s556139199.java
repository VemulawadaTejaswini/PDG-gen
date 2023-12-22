import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        
        int n=sc.nextInt();
        int m=sc.nextInt();
        
        long a[]=new long[n];
        long b[]=new long[n];
        
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            if(i>0){
                b[i]=a[i]+b[i-1];
            }else{
                b[i]=a[i]+0;
            }
        }
        
        int r;
        int l;
        long count=0;
        
        for(r=0;r<n;r++){
            for(l=0;l<=r;l++){
                if((b[r]-b[l]+a[l])%m==0){
                    count++;
                }
            }
        }
        
        
        System.out.println(count);
    }
}
