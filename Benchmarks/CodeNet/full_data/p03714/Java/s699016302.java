import java.util.*;

class Main{            
     
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);  
       
       int n = sc.nextInt();
       int a[] = new int[3*n];
       
       for(int i = 0;i < 3*n;i++){
           a[i] = sc.nextInt();
       }
       
       long ans = Long.MIN_VALUE;
       
       PriorityQueue<Integer> left = new PriorityQueue<Integer>();
       PriorityQueue<Integer> right = new PriorityQueue<Integer>(Collections.reverseOrder());
       
       long[] l = new long[n+1];
       long[] r = new long[n+1];
       
       for(int i = 0;i < n;i++){
           left.add(a[i]);
           l[0]+= a[i];
       }
       
       for(int i = 0;i < n;i++){
           right.add(a[i+2*n]);
           r[0] += a[i+2*n];
       }
       
       for(int k = 1;k <=n ;k++){
           left.add(a[n-1+k]);
           l[k] = l[k-1] + a[n-1+k] - left.poll();
           r[k] = r[k-1] + a[2*n - k] - right.poll();           
       }
       
       for(int i = 0;i <= n;i++){
           ans = Math.max(ans,l[i] - r[n-i]);
       }
       
       System.out.println(ans);       
       
   }
}
    