import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
 
public class Main {
 
    Scanner scanner = new Scanner(System.in);
 
    public static void main(String[] args) {
        new Main().compute();
    }
 
    void compute() {
        int N = scanner.nextInt();
        HashMap<Integer,Boolean> used=new HashMap<>();
        for (int i = 0; i < N; i++) {
            int current = scanner.nextInt();
            if(used.containsKey(current)){
                used.remove(new Integer(current));
            }else{
                used.put(current,true);
            }
        }
        System.out.println(used.size());
    }
}