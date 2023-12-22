import java.util.*;

class Main{            
     
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);  
       
       int N = sc.nextInt();
       int [] aMid = new int[N];
       
       Queue<Integer> zenhan = new PriorityQueue<>();
       Queue<Integer> kouhan = new PriorityQueue<>((o1 ,o2) -> o2 - o1);
       
       long[] zenhanSums = new long[N+1];
       long[] kouhanSums = new long[N+1];
       
       for(int i = 0;i < N;i++){
           int a = sc.nextInt();
           zenhan.add(a);                   
           zenhanSums[0] += a;
       }
       
       for(int i = 0;i < N;i++){
          aMid[i] = sc.nextInt();
       }
       
       for(int i = 0;i < N;i++){
           int a = sc.nextInt();
           kouhan.add(a);
           kouhanSums[N] += a;
       }
       
       for(int i = 0;i < N;i++){
          int min = zenhan.poll();
          int added = Math.max(min,aMid[i]);
          zenhan.add(added);
          zenhanSums[i+1] = zenhanSums[i] - min + added;
       }
       
       for(int i = 0;i < N;i++){
           int max = kouhan.poll();
           int added = Math.min(max,aMid[N-i-1]);
           kouhan.add(added);
           kouhanSums[N-i-1]= kouhanSums[N-i] -max + added;
       }
       
       long ans = Long.MIN_VALUE;
       
       for(int i = 0;i < N+1;i++){
           ans = Math.max(ans,zenhanSums[i] - kouhanSums[i]);
       }
       
       System.out.println(ans);
       
   }
}