import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        Integer a[] = new Integer[N];
        for (int i=0; i<N; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a, Comparator.reverseOrder());
        long ret = 0;
      for(int i=0;i<N;i++){
       if(i>=K){
         ret += a[i];
       }
        
      }
      System.out.println(ret);
    }
}