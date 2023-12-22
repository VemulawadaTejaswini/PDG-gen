import java.util.Scanner;
 
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        int count = 0;
        
        for ( int i = 0; i < N; i++ ){
            int[] A = new int[N];
            if ( A[N] % 2 == 0){
                count ++;
            }
        }
        
        
            System.out.println(count);
    }
}