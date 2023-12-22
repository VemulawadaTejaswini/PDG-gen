import java.util.* ;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ; 
        int arr[] = new int[n+1] ; 
        for(int i=1 ; i<=n ; i++){
            arr[i] = sc.nextInt() ; 
        }
        System.out.println(path(arr, n)); 
    }

    static int path(int arr[],int n){
        if(n<=1){
            return 0 ; 
        }
        else{
            return Math.min(Math.abs(arr[n]-arr[n-1])+path(arr, n-1),Math.abs(arr[n-2]-arr[n])+path(arr, n-2)) ; 
        }
    }
}
