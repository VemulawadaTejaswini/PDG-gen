import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
 
//        long startTime = System.currentTimeMillis();
 
        Scanner scanner = new Scanner(System.in);
 
        int N = scanner.nextInt();
 
        ArrayList<Long> X = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            X.add(scanner.nextLong());
        }
        scanner.close();

        @SuppressWarnings("unchecked")
        ArrayList<Long> C = (ArrayList<Long>) X.clone();
        Collections.sort(C);
        System.out.println(C);
        int l = C.size();
        int d = l / 2;
        Long medi = C.get(d);
        
        for (int i = 0; i < N; i++) {
            Long x = X.get(i);
            if (medi >= x) {
                System.out.println(medi);                
            }
            if (medi < x) {
                System.out.println(C.get(d-1));
            }
        }
//        System.out.println(System.currentTimeMillis() - startTime);
    }
}