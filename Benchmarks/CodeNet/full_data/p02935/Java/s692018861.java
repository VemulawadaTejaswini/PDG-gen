import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        List<Double> v = new ArrayList<>();
        for(int i = 0; i < n; i++){
            v.add(scan.nextDouble());
        }
        Collections.sort(v);
        double sum = 0;
        while(v.size() > 1){
            sum += (v.get(0) + v.get(1)) / 2;
            v.add((v.get(0) + v.get(1)) / 2);
            v.remove(0);
            v.remove(0);
            Collections.sort(v);
        }
        System.out.println(sum);
    }
}