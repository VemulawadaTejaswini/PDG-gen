import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int K = Integer.parseInt(sc.next());
        Map<Integer, Double> E = new HashMap<>(); 
        
        int[] p = new int[N];

        for(int i = 0; i < N; i++) {
            p[i] = Integer.parseInt(sc.next());
            if(E.containsKey(p[i])) {
                continue;
            }else {
                E.put(p[i], kitai(p[i]));
            }
        }
        
        double ans = 0;
        for(int i = K-1; i < N; i++) {
            double sum = 0;
            for(int j = i-K+1; j <= i; j++) {
                sum += E.get(p[j]);
            }
            if(ans < sum) {
                ans = sum;
            }
        }
        
        System.out.println(ans);
        
        
        
    }
    
    public static double kitai(int x) {
        double X = 0;
        for(double i = 1; i <= x; i++) {
            X += i / x;
        }
        return X;
    }
}