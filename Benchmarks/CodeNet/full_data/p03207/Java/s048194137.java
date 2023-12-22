import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int p[] = new int[N];
        for(int i=0;i<N;i++){
            p[i]=sc.nextInt();
        }
        Arrays.sort(p);
        int sum = Arrays.stream(p).sum();
        sum -= p[p.length-1]/2;
        System.out.println(sum);
    }
}
