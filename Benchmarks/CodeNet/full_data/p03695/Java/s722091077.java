import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int[] a = new int[N];
        int[] c = new int[9];
        long sum = 0;
        for(int i=0; i<N; i++) {
            a[i] = Integer.parseInt(sc.next());
            c[a[i]/400]++;
        }
       
        int count = 0;
        for(int i=0; i<8; i++) {
            if(c[i] > 0) count++;
        }
        int ansmin = 0;
        int maxans = count;
        if(count > 0) ansmin = count;
        if(count + c[8] >= 8) maxans = 8;
        else maxans = count + c[8];
        System.out.println(ansmin+" "+maxans);
        
    }   
}
