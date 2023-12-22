import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] B = new int[n];
        for (int i = 0; i < (n-1); i++) {
            B[i] = s.nextInt();
        }
        int ans=0;
     for(int i=0;i<n;i++){
         if(i==0){
             ans=B[0];
             continue;
         }
         ans+=B[i];
         if(B[i]>B[i-1]){
             ans-=(B[i]-B[i-1]);
         }
     }

     System.out.print(ans+B[n-2]);
}
}
