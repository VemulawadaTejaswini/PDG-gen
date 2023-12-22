import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        long s = scanner.nextLong();

        HashSet<Long> observed = new HashSet<>();
        observed.add(s);

        long prev = s;

        for(int i=2; i<1000000; i++){

            long candidate;
            if(prev%2 == 0){
                candidate = prev / 2;
            }else{
                candidate = 3 * prev + 1;
            }

            if(observed.contains(candidate)){
                System.out.println(i);
                return;
            }else{
                observed.add(candidate);
                prev = candidate;
            }
        }

    }
}