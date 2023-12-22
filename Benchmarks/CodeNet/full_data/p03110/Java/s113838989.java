import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        float[] x = new float[N];
        String[] s = new String[N];
        long sum = 0;
        for(int i = 0; i<N; i++) {
            x[i] = sc.nextFloat();
            s[i] = sc.next();
            if(s[i].equals("BTC")) {
                sum += x[i]*380000;
            }else {
                sum += x[i];
            }
        }
        System.out.println(sum);
    }
}