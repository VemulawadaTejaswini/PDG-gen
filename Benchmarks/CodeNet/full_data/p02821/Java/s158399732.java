import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    
    /** N人*/
    private static int N;

    /** M回 */
    private static int M;
    
    /** Ai（各人の幸福度）*/
    private static int[] A;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();
        
        A = new int[N];
        for(int i=0;i<N;i++) {
            A[i] = sc.nextInt();
        }
        
        List<Integer> allPairList = new ArrayList<>();
        for(int i=0;i<N;i++) {
            for(int j=0;j<N;j++) {
                allPairList.add(A[i]+A[j]);
            }
        }
        
        int result = allPairList.stream()
        .sorted(Comparator.reverseOrder())
        .limit(M)
        .mapToInt(Integer::intValue)
        .sum();
        
        System.out.println(result);
    }

}
