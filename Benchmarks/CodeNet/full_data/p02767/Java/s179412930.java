import java.util.*;
public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer> X = new ArrayList<>();
        double sum = 0;
        for(int i=0;i<N;i++){
            X.add(sc.nextInt());
            sum+=X.get(i);
        }
        sum/=X.size();
        sum = Math.round(sum);
        int opt = 0;
        for(int i=0;i<N;i++) opt+=Math.pow(X.get(i)-sum,2);
        System.out.println(opt);
    }
}