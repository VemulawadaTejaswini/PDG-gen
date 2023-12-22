import java.util.*;
 

public class Main {
    public static void main(String[] args) {   
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N]; 
        int count = 0;

        for(int i=0; i<N; i++){
            A[i] = sc.nextInt();
        }

        int j=0;
        while(A[j]%2==0){
            if(A[j]%2!=0){
            break;
            }
            if(j==N-1){
            count++;
            j=0;
            break;
            }
            j++;
        }

        System.out.println(count);

        }
    }    



