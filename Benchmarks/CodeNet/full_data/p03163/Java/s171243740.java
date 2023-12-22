import java.util.* ; 

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ; 
        long w = sc.nextInt() ; 
        long wt[] = new long[n] ; 
        long val[] = new long[n] ; 
        for(int i=0 ; i<n ; i++){
            wt[i] = sc.nextLong() ; 
            val[i] = sc.nextLong() ; 
        }
        System.out.println(knapSack(val, wt, n, w));

    }

    static long knapSack(long val[],long wt[],int n, long w){
        if(n==0 || w==0){
            return 0 ; 
        }
        else if(wt[n-1]>w){
           return knapSack(val, wt, n-1, w) ; 
        } 
        else{
            return  Math.max(val[n - 1] + knapSack(val, wt, n - 1, w - wt[n - 1]), knapSack(val, wt, n - 1, w));
        }
    }
}
