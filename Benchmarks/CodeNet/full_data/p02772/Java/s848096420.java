
import java.util.Scanner;

class Main {
  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i = 0; i < N; i++){
         A[i] = sc.nextInt();
        }
        int countA = 0;
    	int countB = 0;
        for(int i = 0; i < N; i++){
         if(A[i]%2 == 0){
            if(A[i]%3 == 0 || A[i]%5 == 0){
            countA++;
            }else{
            countB++;
            }
         }
        }
        if(countB == 0 && countA > 0){
          System.out.println("APPROVED");
        }else{
          System.out.println("DENIED");          
        }
    }
}