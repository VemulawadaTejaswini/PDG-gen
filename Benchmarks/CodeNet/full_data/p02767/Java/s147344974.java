import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);        

        int N = sc.nextInt();
        int X[] = new int[N];

        for(int i=0; i<N; i++){
            X[i] = sc.nextInt();
        }
        
        List<Integer> max_list = new ArrayList<>();
        int max = 0;
        
        for(int i=1; i<=100; i++){
            for(int j=0; j<N; j++){
                max+= Math.abs((i-X[j])*(i-X[j]));
            }
            max_list.add(max);
            max =0;
        }
        Optional<Integer> min = max_list.stream().min((a, b) -> a.compareTo(b));
        System.out.println(min.get());
    }
}