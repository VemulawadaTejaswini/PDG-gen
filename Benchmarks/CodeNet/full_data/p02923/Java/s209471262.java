import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int H[] = new int[N];
        for (int i=0; i<N; i++) {
            H[i] =  Integer.parseInt(sc.next());
        }
        sc.close();

        Integer C[] = new Integer[N];
        for (int i=0; i<N; i++)
            C[i] = 0;

        for (int i=0; i<N-1; i++) {
            for (int j=i; j<N-1; j++) {
                if (H[j]>=H[j+1]) {
                    C[i]++;
                } else {
                    break;
                }
            }
        }
        
        Arrays.sort(C, Collections.reverseOrder());
        System.out.println(C[0]);
    }
}