import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        List<Double> l = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            l.add(s.nextDouble());
        }
        double ans=0;
        for(int i=0;i<n;i++){
            ans+=(1/l.get(i));
        }
        System.out.println(1/ans);
    }
}