import static java.lang.Math.abs;
import java.util.Scanner;


/**
 *
 * @author must
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        
        for (int i=0;i<N;i++){
            A[i] = sc.nextInt();
        }
        int sum=0;
        for (int i=0;i<N-1;i++){
            sum+=abs(A[i+1]-A[i]);
        }
        sum+=abs(A[0]) + abs(A[N-1]);
        
        for(int k=0;k<N;k++){
            int delyen=0;
            int addyen=0;
            if(k==0){
                delyen = abs(A[k]) + abs(A[k+1]-A[k]);
                addyen = abs(A[k+1]);
            }else if(k==N-1){
                delyen = abs(A[k]) + abs(A[k]-A[k-1]);
                addyen = abs(A[k-1]);
            }else{
                delyen = abs(A[k+1]-A[k]) + abs(A[k]-A[k-1]);
                addyen = abs(A[k+1]-A[k-1]);                
            }
            int sum1 = sum - delyen + addyen;
            System.out.println(sum1);
        }
        

     }
    
}
