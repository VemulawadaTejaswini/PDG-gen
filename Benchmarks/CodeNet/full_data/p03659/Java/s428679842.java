import java.util.Scanner;

/**
 *
 * @author ena000078
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cards[] = new int[N];
        int sum = 0;
        
        for (int i=0;i<N;i++){
            cards[i] = sc.nextInt();
            sum += cards[i];
        }
        
        int sumA = 0,sumB;
        int min[] = new int[N-1];
        
        for(int i=0;i<N-1;i++){
            sumA += cards[i];
            sum  -= cards[i];
            min[i] = Math.abs(sumA - sum);
        }
        int minimum = min[0];
        for(int i=1;i<min.length;i++){
            if(minimum>min[i]){
                minimum = min[i];
            }
        }
        System.out.println(minimum);
    }
}
