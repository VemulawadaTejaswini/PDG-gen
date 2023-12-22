import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int x = sc.nextInt();
        int ans = 0;
        Integer A[] = new Integer[N];
        for (int j=0; j<N; j++) {
            A[j] = sc.nextInt();
        }
      
        for (int i=0;i<N-1;i++){
         if (A[i]+ A[i+1] > x){
           ans += A[i]+A[i+1]-x;
           A[i+1] =Math.max(0,x-A[i]);
        }
        }   
          
       System.out.println(ans);
    }
}
