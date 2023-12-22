import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        List<Integer> difficult = new ArrayList<Integer>();
        int N;
        
        N = sc.nextInt();
        for(int i=0; i<N; i++)  difficult.add(sc.nextInt());
        
        Collections.sort(difficult);
        
        System.out.println(difficult.get(N/2) - difficult.get(N/2 - 1));
    }
}
