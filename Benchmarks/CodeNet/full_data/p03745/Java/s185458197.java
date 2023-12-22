import java.util.*;
 
 
class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int A[] = new int[N];
        for(int i=0; i<A.length; i++){
            A[i] = sc.nextInt();
        }
        int n = 1;

        for(int i=1; i<A.length - 1; i++){

            if(A[i-1] < A[i] && A[i] > A[i+1]){
                n++;
                i++;

            } else if(A[i-1] > A[i] && A[i] < A[i+1]){
                n++;
                i++;
            }
        }

        System.out.println(n);

    }
}