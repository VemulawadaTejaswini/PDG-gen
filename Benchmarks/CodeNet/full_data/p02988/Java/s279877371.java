import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n = entrada.nextInt();
        int A[] = new int[n];
        for(int i=0;i<n;i++){
            A[i]=entrada.nextInt();
        }
        HashMap<Integer,Integer> HT= new HashMap<>();
        for (int i = 1; i < (A.length) - 1; i++) {
            int B[] = new int[3];
            B[0] = A[i - 1];
            B[1] = A[i];
            B[2] = A[i + 1];
            Arrays.sort(B);
            HT.put(B[1],B[1]);
        }
        System.out.println(HT.size());
        
    }
}
